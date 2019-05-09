package com.chuangyingkeji.serialportdetection.application;

import android.app.Application;

import com.chuangyingkeji.serialportdetection.utils.EncapsulationClass.CrashHandler;
import com.chuangyingkeji.serialportdetection.utils.http.SSLSocketClient;
import com.lzy.okgo.OkGo;
import com.tencent.bugly.crashreport.CrashReport;

import okhttp3.OkHttpClient;

/**
 * Created by Norton on 2017/12/2.
 */

public class MyApplication extends Application {
    public static int sendByte = 0;//发送出去的字节数
    public static int receiveByte = 0;//接收到的字节数

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
        CrashReport.initCrashReport(getApplicationContext(), "391439c64f", false);


        setOkGoHttp();
    }

    // 初始化okhttp
    private void setOkGoHttp() {

        OkHttpClient build = new OkHttpClient.Builder()
                .sslSocketFactory(SSLSocketClient.getSSLSocketFactory())
                .hostnameVerifier(SSLSocketClient.getHostnameVerifier())
                .build();
        //初始化okgo并配置给httpclient
        OkGo.getInstance().init(this).setOkHttpClient(build);
    }
}
