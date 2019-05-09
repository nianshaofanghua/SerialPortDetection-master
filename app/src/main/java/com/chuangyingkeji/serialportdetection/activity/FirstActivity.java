package com.chuangyingkeji.serialportdetection.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.chuangyingkeji.serialportdetection.R;
import com.chuangyingkeji.serialportdetection.module.SocketModel;
import com.chuangyingkeji.serialportdetection.module.SocketOpenModel;
import com.chuangyingkeji.serialportdetection.module.SocketSendOrderModel;
import com.chuangyingkeji.serialportdetection.utils.EncapsulationClass.Md5Utils;
import com.chuangyingkeji.serialportdetection.utils.Interfaces.SocketMessageListener;
import com.chuangyingkeji.serialportdetection.utils.http.NetworkConnections;
import com.chuangyingkeji.serialportdetection.utils.http.SocketUtils;
import com.google.gson.Gson;

import java.util.ArrayList;

import cn.bingoogolapple.bgabanner.BGABanner;
/**
 * Created by syj on 2019/4/11.
 *
 */
public class FirstActivity extends BaseActivity implements SocketMessageListener {

    private SocketUtils mSocketUtils;

    private BGABanner mBanner_content;
    private ImageView iv_code;
    private TextView tv_pay_hint;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_first;
    }

    @Override
    protected void getView() {
        mBanner_content = findViewById(R.id.banner_content);
        iv_code = findViewById(R.id.iv_code);
        tv_pay_hint = findViewById(R.id.tv_pay_hint);
        mSocketUtils = SocketUtils.getInstance();
        mSocketUtils.setSocketMessageListener(this);
        try {
            mSocketUtils.startSocketClient();
        } catch (Exception e) {

        }


    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void setData(boolean isNetWork) {

    }

    //连接成功
    @Override
    public void connectSuccess() {
        Log.e("logzz", "链接成功");
        String connectState = mSocketUtils.requestGameSocketConnectFlg();
        mSocketUtils.socketSendMessage("{\"from\":\"client\",\"cmd\":\"login\",\"dev_no\":\"3030303030303038\",\"ccid\":\"3839383630374238313031373730323133323331\"}");
    }

    //连接失败
    @Override
    public void disConnect() {
        Log.e("logzz", "链接失败");
        //连接失败 进行重连
        mSocketUtils.connect(NetworkConnections.checkNetWork(this));
    }

    //接收消息
    @Override
    public void onResponse(String message) {
        Gson gson = new Gson();
        if (message.contains("7f0000010f3f00000009")) {
            message = message.replace("7f0000010f3f0000000b", "");
        }
        int position = message.indexOf("{");
        message = message.substring(position, message.length());
        SocketOpenModel model = gson.fromJson(message, SocketOpenModel.class);
        ArrayList<SocketModel> list = new ArrayList<>();
        list.add(new SocketModel("from", model.getFrom()));
        list.add(new SocketModel("cmd", model.getCmd()));
        list.add(new SocketModel("order_no", model.getOrder_no()));
        list.add(new SocketModel("dev_no", model.getDev_no()));
        list.add(new SocketModel("cid", model.getCid()));
        list.add(new SocketModel("sev_no", model.getSev_no()));
        list.add(new SocketModel("motor", model.getMotor()));
        String sign = Md5Utils.encrypt(list);
        if (sign.equals(model.getSign())) {
            SocketSendOrderModel sendOrderModel = new SocketSendOrderModel();
            ArrayList<SocketModel> signList = new ArrayList<>();
            signList.add(new SocketModel("from", "client"));
            signList.add(new SocketModel("cmd", "delivery"));
            signList.add(new SocketModel("order_no", "RE1312321321"));
            signList.add(new SocketModel("dev_no", "3030303030303038"));
            signList.add(new SocketModel("status", "0"));
            String sendSign = Md5Utils.encrypt(signList);
            sendOrderModel.setFrom("client");
            sendOrderModel.setCmd("delivery");
            sendOrderModel.setStatus("0");
            sendOrderModel.setDev_no("3030303030303038");
            sendOrderModel.setOrder_no("RE1312321321");
            sendOrderModel.setSign(sendSign);
            Log.e("logzz", "" + new Gson().toJson(sendOrderModel));
            mSocketUtils.socketSendMessage(new Gson().toJson(sendOrderModel));
        }
    }
}
