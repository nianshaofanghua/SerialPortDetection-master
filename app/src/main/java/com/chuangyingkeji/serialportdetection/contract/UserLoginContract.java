package com.chuangyingkeji.serialportdetection.contract;


import com.chuangyingkeji.serialportdetection.presenter.BasePresenter;

/**
 * Created by zxb on 2018/3/13.
 */
public interface UserLoginContract {

    interface View extends BaseView<Presenter>{

        void showLoading();//展示加载框

        void dismissLoading();//取消加载框展示



        String loadUserToken();//接口请求需要一个userToken

    }

    interface Presenter extends BasePresenter {
        void loadUserInfo();
    }
}
