package com.chuangyingkeji.serialportdetection.presenter;

import android.content.Context;


import com.chuangyingkeji.serialportdetection.contract.DataTwoContract;
import com.lzy.okgo.OkGo;

import okhttp3.Call;
import okhttp3.Response;


public class MainPresenter implements DataTwoContract.Presenter {


    private DataTwoContract.View view;
    private Context context;
    public MainPresenter(DataTwoContract.View view , Context context) {
        this.view = view;
        this.context = context;
        view.setPresenter(this);
    }

    @Override
    public void loadData(String parameterMap) {

    }

    @Override
    public void start(String parameterMap) {
//        OkGo.post(InterfaceAddress.update)
//                .headers("Authorization", view.loadUserToken())
//                .execute(new StringDecryptCallBack<UpdateModel>(context) {
//                    @Override
//                    public void onSuccess(UpdateModel mainUpDateVersionBean, Call call, Response response) {
//view.showDataInfo(mainUpDateVersionBean);
//                    }
//
//                    @Override
//                    public void onError(Call call, Response response, Exception e) {
//                        super.onError(call, response, e);
//                    }
//
//                    @Override
//                    public void onAfter(UpdateModel mainUpDateVersionBean, Exception e) {
//                        super.onAfter(mainUpDateVersionBean, e);
//                    }
//                });

    }
}
