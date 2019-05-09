package com.chuangyingkeji.serialportdetection.utils.Interfaces;

/**
 * Created by Administrator on 2019/4/10.
 */

public interface SocketMessageListener {
    void connectSuccess();
    void disConnect();
    void onResponse(String message);
}
