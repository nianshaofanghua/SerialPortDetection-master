package com.chuangyingkeji.serialportdetection.module;

public class UpdateModel {


    /**
     * code : 200
     * msg : success
     * data : {"apk_id":"11","apk_name":"1.1.2","apk_address":"http://qn.lianshangatm.com/lkt4a2Dmb9uFwvzgnlX62bqmmv9n","time":"1553760061"}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * apk_id : 11
         * apk_name : 1.1.2
         * apk_address : http://qn.lianshangatm.com/lkt4a2Dmb9uFwvzgnlX62bqmmv9n
         * time : 1553760061
         */

        private String apk_id;
        private String apk_name;
        private String apk_address;
        private String time;

        public String getApk_id() {
            return apk_id;
        }

        public void setApk_id(String apk_id) {
            this.apk_id = apk_id;
        }

        public String getApk_name() {
            return apk_name;
        }

        public void setApk_name(String apk_name) {
            this.apk_name = apk_name;
        }

        public String getApk_address() {
            return apk_address;
        }

        public void setApk_address(String apk_address) {
            this.apk_address = apk_address;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
