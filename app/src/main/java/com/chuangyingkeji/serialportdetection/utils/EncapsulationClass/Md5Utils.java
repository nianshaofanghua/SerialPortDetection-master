package com.chuangyingkeji.serialportdetection.utils.EncapsulationClass;

import com.chuangyingkeji.serialportdetection.module.SocketModel;
import com.chuangyingkeji.serialportdetection.utils.constant.Config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/10.
 */

public class Md5Utils {


    public static String encrypt(ArrayList<SocketModel> list) {
        String sign = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sign = list.get(i).getKey() + "=" + list.get(i).getValue();
            } else {
                sign = sign + "&" + list.get(i).getKey() + "=" + list.get(i).getValue();
            }
        }
        sign = sign + "&key=" + Config.SIGN;


        return getMd5(sign).toUpperCase();
    }

    //静态方法，便于作为工具类
    public static String getMd5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }
}
