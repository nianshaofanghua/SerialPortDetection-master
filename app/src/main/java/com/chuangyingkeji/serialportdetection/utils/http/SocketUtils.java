package com.chuangyingkeji.serialportdetection.utils.http;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.util.Log;

import com.chuangyingkeji.serialportdetection.utils.Interfaces.SocketMessageListener;
import com.chuangyingkeji.serialportdetection.utils.URLAdress.InterfaceAddress;
import com.vilyever.socketclient.SocketClient;
import com.vilyever.socketclient.helper.SocketClientDelegate;
import com.vilyever.socketclient.helper.SocketResponsePacket;
import com.vilyever.socketclient.util.CharsetUtil;

import java.io.IOException;


/**
 * Created by Administrator on 2019/4/10.
 */

public class SocketUtils {

    private SocketClient socketClient;
    private SocketClientDelegate delegate;
    private SocketMessageListener mSocketMessageListener;
    private static SocketUtils socketUtils;
private Handler handler;
    private SocketUtils() {

    }

    public static SocketUtils getInstance() {

        if (socketUtils == null) {
            socketUtils = new SocketUtils();
        }
        return socketUtils;
    }


    //socket通信
    public void startSocketClient() throws IOException {

        socketClient = new SocketClient();
        handler = new Handler();
        socketClient.getAddress().setRemoteIP(InterfaceAddress.socket);//设置IP,这里设置的是本地IP
        socketClient.getAddress().setRemotePort(Integer.parseInt("8282"));//设置端口
        socketClient.getAddress().setConnectionTimeout(60 * 1000);//设置超时时间
        /**
         * 设置自动发送的心跳包信息
         */
    //    socketClient.getHeartBeatHelper().setSendString("HeartBeat");
        // 设置自动发送心跳  包的时间间隔，若值小于0则不发送心跳包
    //    socketClient.getHeartBeatHelper().setHeartBeatInterval(30 * 1000);
        // 设置从远程端接收的心跳包字符串，onResponse回调将过滤此信息，若为null则不过滤
    //    socketClient.getHeartBeatHelper().setReceiveString("heart beat from remote");
        // 设置远程端多长时间内没有消息发送到本地就自动断开连接，若值小于0则不自动断开
        //socketClient.getHeartBeatHelper().setRemoteNoReplyAliveTimeout(60 * 1000);
//        // 设置自动应答键值对，即收到"query"时自动发送"response"
//        socketClient.getPollingHelper().registerQueryResponse("query", "response");


        socketClient.setCharsetName(CharsetUtil.UTF_8);//设置编码格式，默认为UTF-8
        socketClient.connect(); // 连接，异步进行

        //常用回调配置
        // 对应removeSocketClientDelegate
        socketClient.registerSocketClientDelegate(delegate = new SocketClientDelegate() {
            /**
             * 连接上远程端时的回调
             */
            @Override
            public void onConnected(SocketClient client) {
                if (mSocketMessageListener != null) {
                    mSocketMessageListener.connectSuccess();
                }

                Log.e("logzz","onConnected"+client.isConnected());
            }

            /**
             * 与远程端断开连接时的回调
             */
            @Override
            public void onDisconnected(SocketClient client) {
                if (mSocketMessageListener != null) {
                    mSocketMessageListener.disConnect();
                }

            }

            /**
             * 接收到数据包时的回调
             */
            @Override
            public void onResponse(SocketClient client, @NonNull SocketResponsePacket responsePacket) {

                String message = responsePacket.getMessage(); // 获取按默认设置的编码转化的String，可能为null
                if (mSocketMessageListener != null && message != null) {
                    mSocketMessageListener.onResponse(message);
                }

            }
        });
    }

    //发送消息
    public void socketSendMessage(String info) {
        String status = String.valueOf(socketClient.getState());
        if (socketClient != null && status == "Connected") {
            socketClient.sendData(info.getBytes()); // 发送byte[]消息
        }
    }

    //前台请求gamesocket连接状态
    public String requestGameSocketConnectFlg() {
        String status = String.valueOf(socketClient.getState());

        return status;
    }

    public void  connect(boolean isNetConnect){
        // 可在此实现自动重连
        // 之后加上断网处理   目前三秒进行一次连接
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                socketClient.connect();
            }
        },3000);
    }


    //前台主动断开gamesocket
    private void closeGameSocket() {
        if (socketClient != null) {
            socketClient.removeSocketClientDelegate(delegate);
            socketClient.disconnect();
        }
    }

    public void setSocketMessageListener(SocketMessageListener listener) {
        mSocketMessageListener = listener;
    }

}
