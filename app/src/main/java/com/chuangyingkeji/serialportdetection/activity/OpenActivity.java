package com.chuangyingkeji.serialportdetection.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.chuangyingkeji.serialportdetection.R;
import com.chuangyingkeji.serialportdetection.constants.IConstant;
import com.chuangyingkeji.serialportdetection.utils.SerialPortFinder;
import com.chuangyingkeji.serialportdetection.utils.SerialPortUtil;

public class OpenActivity extends BaseActivity implements View.OnClickListener {
    private TextView tv_serial_port_location, tv_open, tv_open_serial, tv_serial_back;
    private Spinner mSpinner;
    private EditText et_send;
private  boolean isOpen;
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_open;
    }

    @Override
    protected void getView() {
        tv_serial_port_location = findViewById(R.id.tv_serial_port_location);
        tv_open = findViewById(R.id.tv_open);
        tv_open_serial = findViewById(R.id.tv_open_serial);
        tv_serial_back = findViewById(R.id.tv_serial_back);
        mSpinner = findViewById(R.id.sp);
        et_send = findViewById(R.id.et_send);

    }

    @Override
    protected void setListener() {
        tv_open.setOnClickListener(this);
        tv_open_serial.setOnClickListener(this);

    }

    @Override
    protected void setData(boolean isNetWork) {
        SerialPortFinder serialPortFinder = new SerialPortFinder();
        String[] strings1 = serialPortFinder.getAllDevices();
        String path = "";
        for (String s :
                strings1) {
            Log.e("SerialPortFinder", "SerialPortFinder的大小" + s);
            path = s + path;
        }
        tv_serial_port_location.setText(path);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, IConstant.SERIAL_PORT.getOptions());
        mSpinner.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_open:
                if(isOpen){
                    isOpen =false;
                }else {
                    isOpen = true;
                }


                break;
            case R.id.tv_open_serial:

                break;

        }
    }

}
