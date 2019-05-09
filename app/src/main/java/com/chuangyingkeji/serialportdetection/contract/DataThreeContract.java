package com.chuangyingkeji.serialportdetection.contract;


import com.chuangyingkeji.serialportdetection.presenter.BasePresenter;

/**
 * Created by zxb on 2018/4/10.
 */

public interface DataThreeContract {
    interface View<T1,T2,T3> extends BaseView<Presenter>{

        void showLoading();//展示加载框

        void dismissLoading();//取消加载框展示

        void showDataInfo(T1 t1);//将网络请求得到的用户信息回调

        void showSecondDataInfo(T2 t2);//将网络请求得到的用户信息回调

        void showMoreDataInfo(T3 t3);//将网络请求得到的用户信息回调

        String loadUserToken();//接口请求需要一个userToken
    }

    interface Presenter extends BasePresenter {
        void loadData(String parameterMap);
    }
}
