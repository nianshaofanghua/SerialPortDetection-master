package com.chuangyingkeji.serialportdetection.module;

/**
 * Created by Administrator on 2019/4/10.
 */

public class SocketSendOrderModel {

    /**
     * from : client
     * cmd : delivery
     * order_no : RE1312321321
     * dev_no : 3030303030303038
     * status : 0
     * sign : E978D35B042CE452DDB6836597ED9982
     */

    private String from;
    private String cmd;
    private String order_no;
    private String dev_no;
    private String status;
    private String sign;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getDev_no() {
        return dev_no;
    }

    public void setDev_no(String dev_no) {
        this.dev_no = dev_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
