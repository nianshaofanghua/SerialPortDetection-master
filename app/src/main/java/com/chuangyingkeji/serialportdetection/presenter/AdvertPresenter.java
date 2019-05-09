package com.chuangyingkeji.serialportdetection.presenter;

import android.content.Context;
import android.util.Log;


import com.chuangyingkeji.serialportdetection.contract.DataContract;
import com.chuangyingkeji.serialportdetection.module.AdvertModel;
import com.chuangyingkeji.serialportdetection.utils.http.StringDecryptCallBack;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;


import okhttp3.Call;

public class AdvertPresenter implements DataContract.Presenter {

    private DataContract.View view;
    private Context context;

    public AdvertPresenter(DataContract.View view, Context context) {
        this.view = view;
        this.context = context;
        view.setPresenter(this);
    }

    @Override
    public void loadData(String parameterMap) {

    }

    @Override
    public void start(String parameterMap) {



        OkGo.<AdvertModel>get("https://adopt.yeshitou.com/v1/share/home?dev_no=3030303030303038")
                //.tag()

                .execute(new StringDecryptCallBack<AdvertModel>(context) {
                    @Override
                    public void onSuccess(Response<AdvertModel> response) {
                        super.onSuccess(response);
                        view.showDataInfo(response.body());
                    }

                    @Override
                    public void onError(Response<AdvertModel> response) {
                        super.onError(response);
                    }
                });

//                .execute(new StringDecryptCallBack<AdvertModel>(context) {
//
//                    @Override
//                    public void onSuccess(Response<AdvertModel> response) {
//                        super.onSuccess(response);
//                    }
//
//                    @Override
//                    public void onError(Response<AdvertModel> response) {
//                        super.onError(response);
//                    }
//                });
    }
}
