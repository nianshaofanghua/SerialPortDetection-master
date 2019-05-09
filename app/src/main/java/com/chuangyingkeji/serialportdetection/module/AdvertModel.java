package com.chuangyingkeji.serialportdetection.module;

import android.graphics.Bitmap;

import java.util.List;

public class AdvertModel {


    /**
     * code : 200
     * msg : success
     * data : {"logo":"http://qn.lianshangatm.com/e13f8c51c143a96b3d0aece69c9c7274","rule":{"rule":"1、使用微信扫描屏幕右下角二维码\r\n2、在手机上进行支付\r\n3、开门后放入电池并关好箱门\r\n4、系统自动开满电状态电池箱门，取走电池\r\n5、取走电池后请关好箱门"},"url":"http://adopt.yeshitou.com/index.php/index/Share/home_page","images":[{"name":"12321321545","type":"2","img":"http://qn.lianshangatm.com/Fpp0dEuuVRRZbsELLrY5X5way78c"},{"name":"3123","type":"2","img":"http://qn.lianshangatm.com/FpsBjfT-acloVZsLNVDsOpXu5Kd4"},{"name":"312312312","type":"2","img":"http://qn.lianshangatm.com/Fg4jqIRz_PuWVOdfhBXD84AvsJNh"},{"name":"订单详情","type":"1","img":"http://qn.lianshangatm.com/4062d483395186022d8f4787f4fe0a8c"},{"name":"进出口岸","type":"1","img":"http://qn.lianshangatm.com/da37bb0b3278d6de2f54f92040af110d"},{"name":"进出口岸","type":"1","img":"http://qn.lianshangatm.com/8f806a81816ae7f9439d2d9f0f335d3d"},{"name":"测试一波","type":"1","img":"http://qn.lianshangatm.com/42dff62d7b4fac3286970b795684b6dd"}]}
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
         * logo : http://qn.lianshangatm.com/e13f8c51c143a96b3d0aece69c9c7274
         * rule : {"rule":"1、使用微信扫描屏幕右下角二维码\r\n2、在手机上进行支付\r\n3、开门后放入电池并关好箱门\r\n4、系统自动开满电状态电池箱门，取走电池\r\n5、取走电池后请关好箱门"}
         * url : http://adopt.yeshitou.com/index.php/index/Share/home_page
         * images : [{"name":"12321321545","type":"2","img":"http://qn.lianshangatm.com/Fpp0dEuuVRRZbsELLrY5X5way78c"},{"name":"3123","type":"2","img":"http://qn.lianshangatm.com/FpsBjfT-acloVZsLNVDsOpXu5Kd4"},{"name":"312312312","type":"2","img":"http://qn.lianshangatm.com/Fg4jqIRz_PuWVOdfhBXD84AvsJNh"},{"name":"订单详情","type":"1","img":"http://qn.lianshangatm.com/4062d483395186022d8f4787f4fe0a8c"},{"name":"进出口岸","type":"1","img":"http://qn.lianshangatm.com/da37bb0b3278d6de2f54f92040af110d"},{"name":"进出口岸","type":"1","img":"http://qn.lianshangatm.com/8f806a81816ae7f9439d2d9f0f335d3d"},{"name":"测试一波","type":"1","img":"http://qn.lianshangatm.com/42dff62d7b4fac3286970b795684b6dd"}]
         */

        private String logo;
        private RuleBean rule;
        private String url;
        private List<ImagesBean> images;

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public RuleBean getRule() {
            return rule;
        }

        public void setRule(RuleBean rule) {
            this.rule = rule;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public static class RuleBean {
            /**
             * rule : 1、使用微信扫描屏幕右下角二维码
             2、在手机上进行支付
             3、开门后放入电池并关好箱门
             4、系统自动开满电状态电池箱门，取走电池
             5、取走电池后请关好箱门
             */

            private String rule;

            public String getRule() {
                return rule;
            }

            public void setRule(String rule) {
                this.rule = rule;
            }
        }

        public static class ImagesBean {
            /**
             * name : 12321321545
             * type : 2
             * img : http://qn.lianshangatm.com/Fpp0dEuuVRRZbsELLrY5X5way78c
             */

            private String name;
            private String type;
            private String img;
private Bitmap bitmap;


            public Bitmap getBitmap() {
                return bitmap;
            }

            public void setBitmap(Bitmap bitmap) {
                this.bitmap = bitmap;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
