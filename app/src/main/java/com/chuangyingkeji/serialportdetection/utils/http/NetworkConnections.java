package com.chuangyingkeji.serialportdetection.utils.http;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by zxb on 2018/2/5.
 */
public class NetworkConnections {

    /**
     * 检测网络是否连接
     * @return
     */
    public static boolean checkNetWork(Context context) {
        boolean flag = false;
        ConnectivityManager cwjManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cwjManager.getActiveNetworkInfo() != null) {
            flag = cwjManager.getActiveNetworkInfo().isAvailable();
        }
        return flag;
    }
}
