package com.chuangyingkeji.serialportdetection.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.chuangyingkeji.serialportdetection.R;
/**
 * Created by syj on 2019/4/11.
 *
 */

public class OrderActivity extends BaseActivity {
    private TextView tv_title,
            tv_1,
            tv_2, tv_3,
            tv_4, tv_5,
            tv_state_hint,
            tv_hint,
            tv_action_hint;
    private ImageView iv_state, iv_action_hint;


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_order;
    }

    @Override
    protected void getView() {
        tv_title = findViewById(R.id.tv_title);
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_3 = findViewById(R.id.tv_3);
        tv_4 = findViewById(R.id.tv_4);
        tv_5 = findViewById(R.id.tv_5);
        tv_state_hint = findViewById(R.id.tv_state_hint);
        tv_hint = findViewById(R.id.tv_hint);
        tv_action_hint = findViewById(R.id.tv_action_hint);
        iv_state = findViewById(R.id.iv_state);
        iv_action_hint = findViewById(R.id.iv_action_hint);


    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void setData(boolean isNetWork) {

    }
}
