package com.chuangyingkeji.serialportdetection.utils.EncapsulationClass;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxb on 2018/3/26.
 */

public class ParameterMap {
    /**
     * 请求最新列表数据
     */
    public static String getNewsList(String page) {

        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 请求登录 用密码登录
     * @return
     */
    public static Map getUserPassWord(String mobile,String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type","password");
        map.put("mobile",mobile);
        map.put("password",password);
        return map;
    }
    /**
     * 请求登录 用验证码登录登录
     * @param mobile
     * @param code
     * @return
     */
    public static Map getUserVerification(String mobile,String code){
        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type","sms");
        map.put("mobile",mobile);
        map.put("sms_code",code);
        return map;
    }
    /**
     * 信息验证
     */
    public static String getsendSms(String mobile,String template){
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile",mobile);
        map.put("template",template);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    public static Map getsendSmsMap(String mobile,String template){
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile",mobile);
        map.put("template",template);
        return map;
    }

    /**
     * 二手房搜索
     */
    public static String getErshouSearch(String page,String search_name,String req_type,String user_lng, String user_lat,String school,String subway,String district,
                                       String near,String price,String price_min,String price_max,String room,String sort,String area,String faces,
                                       String tags, String decorate,String floor,String lift,String age){
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        map.put("search_name",search_name);
        map.put("req_type",req_type);
        map.put("user_lng",user_lng);
        map.put("user_lat",user_lat);
        map.put("district",district);
        map.put("subway",subway);
        map.put("school",school);
        map.put("near",near);
        map.put("price",price);
        map.put("price_min",price_min);
        map.put("price_max",price_max);
        map.put("room",room);
        map.put("sort",sort);
        map.put("area",area);
        map.put("faces",faces);
        map.put("tags",tags);
        map.put("decorate",decorate);
        map.put("floor",floor);
        map.put("lift",lift);
        map.put("age",age);
        map.put("more","9");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 二手房地图搜索
     */
    public static String getErshouMapSearch(String page,String community_id,String user_lng, String user_lat){
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        map.put("req_type","map_community");
        map.put("community_id",community_id);
        map.put("user_lng",user_lng);
        map.put("user_lat",user_lat);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 二手房地图列表搜索
     */
    public static String getErshouMapListSearch(String page,String community_id,String user_lng, String user_lat,String price,
                                            String price_min,String price_max,String room,String sort,String area,String faces,
                                            String tags, String decorate,String floor,String lift,String age){
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        map.put("req_type","map_community");
        map.put("community_id",community_id);
        map.put("user_lng",user_lng);
        map.put("user_lat",user_lat);
        map.put("price",price);
        map.put("price_min",price_min);
        map.put("price_max",price_max);
        map.put("room",room);
        map.put("sort",sort);
        map.put("area",area);
        map.put("faces",faces);
        map.put("tags",tags);
        map.put("decorate",decorate);
        map.put("floor",floor);
        map.put("lift",lift);
        map.put("age",age);
        map.put("more","9");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 二手房关键字搜索
     */
    public static String getErshouKeyWord(String page, String search_name){
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        map.put("search_name",search_name);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 学校关键字搜索
     */
    public static String getSchoolSearch(String page, String keyword,String district,String type,String tag,String user_lng, String user_lat){
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        map.put("keyword",keyword);
        map.put("district", district);
        map.put("type", type);
        map.put("tag", tag);
        map.put("user_lng",user_lng);
        map.put("user_lat",user_lat);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 可观头条
     */
    public static Map getHeaderLine(String title,String author,String content,
                                    String startTime,String endTime,String news_cate_id,
                                    String news_label_id,String city_id,String is_top){
        HashMap<String, String> map = new HashMap<>();
        map.put("title",title);
        map.put("author",author);
        map.put("content",content);
        map.put("startTime",startTime);
        map.put("endTime ",endTime );
        map.put("news_cate_id ",news_cate_id);
        map.put("news_label_id ",news_label_id);
        map.put("city_id ",city_id);
        map.put("is_top ",is_top);
        return map;
    }
    /**
     * 二手房详情
     */
    public static String getErShouFangDetails(String house_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_id",house_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 二手房周边推荐房源
     */
    public static Map getErShouFangRecommend(String house_id,String page,String page_size){
            HashMap<String,String> map=new HashMap<>();
            map.put("house_id",house_id);
            map.put("page",page);
            map.put("page_size",page_size);
            return map;
    }
    /**
     * 用户登录获取用户信息的Json
     */
    public static String getLoginUserInfo(String grant_type, String phone, String typeStrKey,String typeStrValue) {
        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type", grant_type);
        map.put("mobile", phone);
        map.put(typeStrKey, typeStrValue);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();//通过加密的工具类，进行转换成json  然后进行加密
    }
    /**
     * 用户登录获取用户信息的Json
     */
    public static String getBangDingUserInfo(String grant_type, String phone, String typeStrKey,String typeStrValue,String key,String value) {
        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type", grant_type);
        map.put("mobile", phone);
        map.put(typeStrKey, typeStrValue);
        map.put(key, value);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();//通过加密的工具类，进行转换成json  然后进行加密
    }
    /**
     * 用户登录获取用户信息的Map
     */
    public static Map getLoginUserInfoMap(String grant_type, String phone, String typeStrKey,String typeStrValue) {
        HashMap<String, String> map = new HashMap<>();
        map.put("grant_type", grant_type);
        map.put("mobile", phone);
        map.put(typeStrKey, typeStrValue);
//        JSONObject jsonObject = new JSONObject(map);
        return map;
    }
    /**
     *小区基础详情
     */
    public static String getCommunity(String community_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 取消和关注二手房
     */
    public static String getErShouFollow(String house_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_id",house_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 看房日程
     */
    public static String getKanFangOrderCreate(String house_id,String real_name,
                                               String reserve_day,String reserve_time,
                                               String remark,String employee_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_id",house_id+"");
        map.put("real_name",real_name+"");
        map.put("reserve_day",reserve_day+"");
        map.put("reserve_time",reserve_time+"");
        map.put("remark",remark+"");
        map.put("employee_id",employee_id+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 删除看房日程
     */
    public static String getDeleteHouseId(String house_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_id",house_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 搜索二手房
     */
    public static String getSearchErShouHouse(String search_name){
        HashMap<String, String> map = new HashMap<>();
        map.put("search_name",search_name);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    public static String getKanFangOrder(String page){
        HashMap<String, String> map = new HashMap<>();
        map.put("page",page);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     *   看房日程详情
     */
    public static String getkanfangOrderDetail(String order_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("order_id",order_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 学校详情
     */
    public static String getSchoolDetails(String  school_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("school_id",school_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 地图找房
     */
    public static String getMapSearchHourse(String  data_type,double max_lat,double min_lat,double max_lng,
                                            double min_lng,String price,String price_min,String price_max,String room,
                                            String area,String faces,
                                            String tags, String decorate,String floor,String lift,String age){
        HashMap<String, String> map = new HashMap<>();
        map.put("data_type",data_type);
        map.put("max_lat",max_lat+"");
        map.put("min_lat",min_lat+"");
        map.put("max_lng",max_lng+"");
        map.put("min_lng",min_lng+"");
        map.put("price",price+"");
        map.put("price_min",price_min+"");
        map.put("price_max",price_max+"");
        map.put("room",room+"");
        map.put("area",area+"");
        map.put("faces",faces+"");
        map.put("tags",tags+"");
        map.put("decorate",decorate+"");
        map.put("floor",floor+"");
        map.put("lift",lift+"");
        map.put("age",age+"");
        map.put("more","7");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 获取会话头像昵称
     */
    public static String getChatEmployeeInfo(String chat_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("chat_id",chat_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 创建新会话
     */
    public static String getchatCreate(String  employee_chat_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("employee_chat_id",employee_chat_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 用户关注的二手房列表
     */
    public static String getfollowErshou(String page){
        HashMap<String, String> map = new HashMap<>();
        map.put("page",page);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 用户关注的小区列表
     */
    public static String getfollowCommunity(String page){
        HashMap<String, String> map = new HashMap<>();
        map.put("page",page);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 保存二手房举报信息
     */
    public static String ershouReport(String house_id,String type,String remark){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_id",house_id);
        map.put("type",type);
        map.put("remark",remark);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 小区搜索提示建议列表
     * @param search_name
     * @return
     */
    public static String suggestion(String search_name){
        HashMap<String, String> map = new HashMap<>();
        map.put("search_name",search_name);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 小区楼栋列表
     * @param community_id
     * @return
     */
    public static String seat(String community_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 小区楼栋列表
     * @param community_id
     * @param seat_num
     * @return
     */
    public static String seat(String community_id,String seat_num){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id);
        map.put("seat_num",seat_num);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 小区楼栋列表
     * @param community_id
     * @param seat_num
     * @param page
     * @return
     */
    public static String seat(String community_id,String seat_num,String page){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id);
        map.put("seat_num",seat_num);
        map.put("page",page);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    public static String entrustCreate(String community_name,String user_name,String type,String price,String address){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_name",community_name);
        map.put("user_name",user_name);
        map.put("type",type);
        map.put("price",price);
        map.put("address",address);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 删除委托
     */
    public static String entrustDelete(String house_entrust_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_entrust_id",house_entrust_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    public static String comments(String community_id,String page,String page_size,String param){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id);
        map.put("page",page+"");
        map.put("page_size",page_size+"");
        map.put("param",param+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 地铁找房
     */
    public static String getSubWaySearch(String  line_id,String price,String price_min,String price_max,String room,String area,String faces,
                                         String tags, String decorate,String floor,String lift,String age){
        HashMap<String, String> map = new HashMap<>();
        map.put("line_id",line_id);
        map.put("price",price+"");
        map.put("price_min",price_min+"");
        map.put("price_max",price_max+"");
        map.put("room",room+"");
        map.put("area",area+"");
        map.put("faces",faces+"");
        map.put("tags",tags+"");
        map.put("decorate",decorate+"");
        map.put("floor",floor+"");
        map.put("lift",lift+"");
        map.put("age",age+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 房贷计算器
     */
    public static String getCalculator(String  loan_time,String  com_loan_value,
                                       String  com_loan_rate,String  fund_loan_value,String  fund_loan_rate){
        HashMap<String, String> map = new HashMap<>();
        map.put("loan_time",loan_time);
        map.put("com_loan_value",com_loan_value);
        map.put("com_loan_rate",com_loan_rate);
        map.put("fund_loan_value",fund_loan_value);
        map.put("fund_loan_rate",fund_loan_rate);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 小区搜索
     */
    public static String getCellListSearch(String page,String search_name,String user_lng, String user_lat,String school,
                                           String subway,String district, String near,String avg_price,String build_type,String age,String sort){
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page);
        map.put("search_name",search_name);
        map.put("user_lng",user_lng);
        map.put("user_lat",user_lat);
        map.put("district",district);
        map.put("subway",subway);
        map.put("school",school);
        map.put("near",near);
        map.put("avg_price",avg_price);
        map.put("build_type",build_type);
        map.put("age",age);
        map.put("sort",sort);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 二手房推荐房源
     * @param house_id
     * @param page
     * @param page_size
     * @return
     */
    public static String recommend(String house_id,String page,String page_size){
        HashMap<String, String> map = new HashMap<>();
        map.put("house_id",house_id);
        map.put("page",page);
        map.put("page_size",page_size);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    public static String store(String community_id,String content,String tag){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id);
        map.put("content",content);
        map.put("tag",tag);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 评论点赞
     * @param comment_id
     * @return
     */
    public static String fav(String comment_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("comment_id",comment_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 评论删除
     * @param comment_id
     * @return
     */
    public static String commentDelete(String comment_id){
        HashMap<String, String> map = new HashMap<>();
        map.put("comment_id",comment_id+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    //找回密码（或设置初始密码、修改密码）
    public static String retrievePass(String mobile,String sms_code,String password){
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile",mobile+"");
        map.put("sms_code",sms_code+"");
        map.put("password",password+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    //二手房周边小区
    public static String aroundCommunity(String community_id,String page,String page_size){
        HashMap<String, String> map = new HashMap<>();
        map.put("community_id",community_id+"");
        map.put("page",page+"");
        map.put("page_size",page_size+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    //用户反馈提交
    public static String userFeedback(String feedback_text, Object[] img, String contact_way){
        HashMap<String, String> map = new HashMap<>();
        HashMap <String, Object[]> mapImage = new HashMap <>();
        HashMap<String, String> mapWay = new HashMap<>();
        map.put("feedback_text",feedback_text+"");
        mapImage.put("img[]",img);
        mapWay.put("contact_way",contact_way+"");
        JSONObject jsonObject = new JSONObject(map);
        JSONObject jsonObjectImage = new JSONObject(mapImage);
        JSONObject jsonObjectWay = new JSONObject(mapWay);
        return new Gson().toJson(map) + new Gson().toJson(mapImage) + new Gson().toJson(mapWay);
    }
    /**
     * 二手房带看反馈点赞
     */
    public static String commentUseful(String comment_ids){
        HashMap<String, String> map = new HashMap<>();
        map.put("comment_ids",comment_ids+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 修改用户昵称
     */
    public static String nickname(String nick_name){
        HashMap<String, String> map = new HashMap<>();
        map.put("nick_name",nick_name+"");
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 修改用户头像
     */
    public static String avatarUrl(String img){
        HashMap<String, File> map = new HashMap<>();
        map.put("image", new File(img));
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 更新用户看房笔记
     * @param order_final_id
     * @param user_mark
     * @param user_mark_tag
     * @return
     */
    public static String finalMarkUpdate(String order_final_id,String user_mark,String user_mark_tag){
        HashMap<String, String> map = new HashMap<>();
        map.put("order_final_id",order_final_id);
        map.put("user_mark",user_mark);
        map.put("user_mark_tag",user_mark_tag);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     *经纪人评价
     */
    public static String employeeComment(String order_id){
        HashMap<String, String> map =new HashMap<>();
        map.put("order_id", order_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 经纪人评价提交
     */
    public static String employeeCommentUpdate(String order_id,String comment_level,
                                               String content,String level_tags,String is_anonymous){
        HashMap<String, String> map =new HashMap<>();
        map.put("order_id", order_id);
        map.put("comment_level", comment_level);
        map.put("content", content);
        map.put("level_tags", level_tags);
        map.put("is_anonymous", is_anonymous);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     *小区楼层房间列表
     */
    public static String communityRoom(String seat_id,String room_num,String page,String page_size){
        HashMap<String, String> map =new HashMap<>();
        map.put("seat_id", seat_id);
        map.put("room_num", room_num);
        map.put("page", page);
        map.put("page_size", page_size);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    public static String kanfangRreport(String order_id,String house_id){
        HashMap<String, String> map =new HashMap<>();
        map.put("order_id", order_id);
        map.put("house_id", house_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    public static String unbindOpenAuth(String driver_id,String account_id){
        HashMap<String, String> map =new HashMap<>();
        map.put("driver_id", driver_id);
        map.put("account_id", account_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 看房日程详情二手房列表
     */
    public static String detailHouseList(String order_id){
        HashMap<String, String> map =new HashMap<>();
        map.put("order_id", order_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 学校周边小区
     */
    public static String school(String school_id,String page){
        HashMap<String, String> map =new HashMap<>();
        map.put("school", school_id);
        map.put("page", page);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     * 交易详情
     */
    public static String userTradeDetail(String sold_id){
        HashMap<String, String> map =new HashMap<>();
        map.put("sold_id", sold_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

    /**
     * 评价页面
     * @param sold_id
     * @param type_id
     * @return
     */
    public static String tradeComment(String sold_id,String type_id){
        HashMap<String, String> map =new HashMap<>();
        map.put("sold_id", sold_id);
        map.put("type_id", type_id);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
    /**
     *评价提交
     */
    public static String commentSave(String employee_id,String sold_id,String type_id,String sold_role_type,String content,String level_tags,String comment_level,String is_anonymous){
        HashMap<String, String> map =new HashMap<>();
        map.put("employee_id", employee_id);
        map.put("sold_id", sold_id);
        map.put("type_id", type_id);
        map.put("sold_role_type", sold_role_type);
        map.put("content", content);
        map.put("level_tags", level_tags);
        map.put("comment_level", comment_level);
        map.put("is_anonymous", is_anonymous);
        JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }
}
