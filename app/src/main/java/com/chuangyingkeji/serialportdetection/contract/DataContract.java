package com.chuangyingkeji.serialportdetection.contract;


import com.chuangyingkeji.serialportdetection.presenter.BasePresenter;

/**
 * Created by zxb on 2018/3/21.
 */

public interface DataContract {
    interface View<T> extends BaseView<Presenter>{

        void setPresenter(Presenter presenter);

        void showLoading();//展示加载框

        void dismissLoading();//取消加载框展示

        void showDataInfo(T t);//将网络请求得到的用户信息回调
        String loadUserToken();//接口请求需要一个userToken
    }

    interface Presenter extends BasePresenter {
        void loadData(String parameterMap);

    }
}
