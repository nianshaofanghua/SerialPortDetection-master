package com.chuangyingkeji.serialportdetection.module;

/**
 * Created by Administrator on 2019/4/10.
 */

public class SocketModel {
    private String key;
    private String value;

    public SocketModel(String key,String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
