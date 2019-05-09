package com.chuangyingkeji.serialportdetection.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import com.chuangyingkeji.serialportdetection.utils.ActivityManger.ActivitysManager;

import java.util.List;


public abstract class BaseActivity extends Activity {

    private ActivitysManager activitysManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        getView();
        setListener();
        setData(true);
    }



    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }








    protected ActivitysManager getActivitysManager(){
        return activitysManager;
    }

    //用来控制应用前后台切换的逻辑
    private boolean isCurrentRunningForeground = true;

    @Override
    protected void onStop() {
        super.onStop();
        isCurrentRunningForeground = isRunningForeground();
        if (!isCurrentRunningForeground) {
        }
    }

    public boolean isRunningForeground() {
        ActivityManager activityManager = (ActivityManager) this.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> appProcessInfos = activityManager.getRunningAppProcesses();
        // 枚举进程
        for (ActivityManager.RunningAppProcessInfo appProcessInfo : appProcessInfos) {
            if (appProcessInfo.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND) {
                if (appProcessInfo.processName.equals(this.getApplicationInfo().processName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 抽取积累的方法跳转界面
     */
    protected void jumpToActivity(Class<? extends Activity> actClass) {
        Intent intent = new Intent(this, actClass);
        startActivity(intent);
    }

    /**
     * 抽取积累的方法跳转界面 并且将自己关闭
     */
    protected void jumpToActivityAndFinish(Class<? extends Activity> actClass) {
        jumpToActivity(actClass);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }

    /**
     * 设置布局
     *
     * @return
     */
    protected abstract int getLayoutResId();

    /**
     * 寻找控件
     */

    protected abstract void getView();

    /**
     * 设置监听
     */
    protected abstract void setListener();

    /**
     * 这个参数的是全局网络状态的参数，如果不需要，可以不用
     *
     * @param isNetWork
     */
    protected abstract void setData(boolean isNetWork);


}
