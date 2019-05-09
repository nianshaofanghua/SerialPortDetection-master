package com.chuangyingkeji.serialportdetection.utils.URLAdress;

/**
 * Created by zxb on 2018/5/30.
 */

public class WebViewInterface {
    private static String URL = "";
    private static String BaseUrl() {
        if (InterfaceAddress.isNormal) {
            URL = "https://m.kg-estate.xyz/";
        } else {
            URL = "http://m.kg-estate.xyz/";
        }
        return URL;
    }
    /**
     * 房源对比
     */
    public static String compare=BaseUrl()+"tool/compare?house_ids=";
    //经济人
    public static String followedAgent = BaseUrl() + "my/followedAgent";
    //用户注册协议页面
    public static String registrationAgreement = BaseUrl() + "auth/protocol";
}
