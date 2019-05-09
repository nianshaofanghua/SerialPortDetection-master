package com.chuangyingkeji.serialportdetection.utils.http;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.gson.Gson;

import com.lzy.okgo.callback.AbsCallback;

import org.json.JSONObject;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by zxb on 2018/3/26.
 */


public abstract class StringDecryptCallBack<T> extends AbsCallback<T> {

    private Context act;
    public StringDecryptCallBack(Context act) {
        this.act = act;
    }

    @Override
    public T convertResponse(Response response) throws Exception {
        //获取传递过来的泛型
        Type type = getClass().getGenericSuperclass();
        Type type1 = ((ParameterizedType) type).getActualTypeArguments()[0];
        String string = response.body().string();
        response.close();
        //手动解析
        JSONObject array = new JSONObject(string);
        int code = array.getInt("code");

        Log.e("beanJson", string);
        T Result = new Gson().fromJson(string, type1);
        return Result;
    }

    @Override
    public void onSuccess(com.lzy.okgo.model.Response<T> response) {

    }
}
