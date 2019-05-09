package com.chuangyingkeji.serialportdetection.utils.EncapsulationClass;

import android.text.TextUtils;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zxb on 2018/6/23.
 */

public class StringUtils {

    /**
     * 验证手机号码
     *
     * @param phoneNumber 手机号码
     * @return boolean
     */
    public static boolean checkPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^1[0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


    /**
     * 将分转成整数
     */
    public static String Inte(String money) {
        if (isNumer(money)) {
            double a = Double.parseDouble(money);
            double b = a / 100;
            DecimalFormat fnum = new DecimalFormat("#");
            String dd = fnum.format(b);
            return dd;
        }
        return "";
    }

    /**
     * 判断字符串是否为数字
     *
     * @param str
     * @return
     */
    public static boolean isNumer(String str) {
        if (null != str) {
            for (int i = str.length(); --i >= 0; ) {
                if (!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * 将分转成元
     */
    public static String fen(String money) {
        if (isNumer(money)) {
            double a = Double.parseDouble(money);
            double b = a / 100;
            DecimalFormat fnum = new DecimalFormat("##0.00");
            String dd = fnum.format(b);
            return dd;
        }
        return "";
    }

    /**
     * 将毫克转成克
     */
    public static String weight(String money) {
        if (isNumer(money)) {
            double a = Double.parseDouble(money);
            double b = a / 1000;
            DecimalFormat fnum = new DecimalFormat("##0.000");
            String dd = fnum.format(b);
            return dd;
        }
        return "";
    }


    /**
     * 判断字符串是否有值，如果为null或者是空字符串或者只有空格或者为"null"字符串，则返回true，否则则返回false
     */
    public static boolean isEmpty(String value) {
        if (value != null && !"".equalsIgnoreCase(value.trim()) && !"null".equalsIgnoreCase(value.trim())) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断多个字符串是否相等，如果其中有一个为空字符串或者null，则返回false，只有全相等才返回true
     */
    public static boolean isEquals(String... agrs) {
        String last = null;
        for (int i = 0; i < agrs.length; i++) {
            String str = agrs[i];
            if (isEmpty(str)) {
                return false;
            }
            if (last != null && !str.equalsIgnoreCase(last)) {
                return false;
            }
            last = str;
        }
        return true;
    }

    // 校验Tag Alias 只能是数�?,英文字母和中�? ^[0-9a-zA-Z_!@#$&*+=.|]+$
    public static boolean isValidTagAndAlias(String s) {
        Pattern p = Pattern.compile("^[\u4E00-\u9FA50-9a-zA-Z_!@#$&*+=.|]+$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    /**
     * 验证密码是否是纯数字或纯字母
     *
     * @param s
     * @return
     */
    public static boolean isNumberOrLetter(String s) {
        Pattern p = Pattern.compile("^[0-9A-Za-z]{6,16}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    /**
     * 验证是否是数字字母组合
     * @param s
     * @return
     */
    public static boolean isNumberLetter(String s) {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(.{8,})$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    /**
     * 格式化金额
     *
     * @param f
     * @return
     */
    public static String priceFormat(double f) {
        String str = "";
        // 构造方法的字符格式这里如果小数不足2位,会以0补足.
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        // format 返回的是字符串
        str = decimalFormat.format(f);
        return str;
    }

    //把String转化为float
    public static float convertToFloat(String number, float defaultValue) {
        if (TextUtils.isEmpty(number)) {
            return defaultValue;
        }
        try {
            return Float.valueOf(number);
        } catch (Exception e) {
            return defaultValue;
        }

    }

    //把String转化为double
    public static double convertToDouble(String number, double defaultValue) {
        if (TextUtils.isEmpty(number)) {
            return defaultValue;
        }
        try {
            return Double.valueOf(number);
        } catch (Exception e) {
            return defaultValue;
        }

    }

    //把String转化为int
    public static int convertToInt(String number, int defaultValue) {
        if (TextUtils.isEmpty(number)) {
            return defaultValue;
        }
        try {
            return Integer.valueOf(number);
        } catch (Exception e) {
            return defaultValue;
        }
    }

//    public static String getString(String str){
//        //Pattern pat = Pattern.compile("#.*?#");
//        Pattern pat = Pattern.compile("#[\\p{Print}\\p{InCJKUnifiedIdeographs}&&[^#]]+#");
//        Matcher mat = pat.matcher(str);
//        if(mat.matches()){
//            mat.group(1);
//            return mat.toMatchResult().toString();
//        }
//        return "no Result";
//    }

    public static String encryptionPhone(String phone){
        if(phone!=null&&!phone.equals("")){
            String s1 = phone.substring(0,3);
            String s2 = phone.substring(7,11);
            String newPhone = s1+"****"+s2;
            return newPhone;
        }else{
            return "";
        }
    }
}
