package com.chuangyingkeji.serialportdetection.contract;


/**
 * Created by Administrator on 2018/4/12.
 */

public interface ShowingsContract {
    interface IShowingsView<T> extends BaseView<IShowingsPresenter>{
        String loadUserToken();//接口请求需要一个userToken
        void showDataInfo(T t);//将网络请求得到的用户信息回调


    }
    interface IShowingsPresenter {
        void loadData();
    }

}
