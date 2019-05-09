package com.chuangyingkeji.serialportdetection.utils.URLAdress;

/**
 * Created by zxb on 2018/3/26.
 */

public class InterfaceAddress {
    public static Boolean isNormal = false; //false 为测试环境 true 为正式环境
    private static String BaseUrl() {
        String URL = "";
        if (isNormal) {
            URL = "https://adopt/yeshitou.com";
        } else {
            URL = "https://adopt/yeshitou.com";
        }
        return URL;
    }
    public static String socket = "120.78.92.247";
    //首页头部请求
    public static String update = BaseUrl()+"/v1/home/is_apk";
    public static String advert = BaseUrl()+"/v1/share/home";

}
