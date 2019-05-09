package com.chuangyingkeji.serialportdetection.contract;


import com.chuangyingkeji.serialportdetection.presenter.BasePresenter;

/**
 * Created by Administrator on 2018/4/17.
 */

public interface DataTwoContract {
    interface View<T1,T2> extends BaseView<Presenter>{

        void setPresenter(Presenter presenter);

        void showLoading();//展示加载框

        void dismissLoading();//取消加载框展示

        void showDataInfo(T1 t1);//将网络请求得到的用户信息回调
        void showTwoDataInfo(T2 t1);
        String loadUserToken();//接口请求需要一个userToken
    }

    interface Presenter extends BasePresenter {
        void loadData(String parameterMap);


    }
}
