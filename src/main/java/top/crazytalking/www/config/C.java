package top.crazytalking.www.config;


import top.knxy.library.utils.DateUtils;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 * code > 1000 为自定义范围代码
 */
public class C {
    public final static boolean isDebug = false;

    public final static String getImageHost() {
        if (isDebug) {
            return "http://localhost:8080";
        } else {
            return "https://www.crazytalking.top";
        }
        //return "http://image.fruits.knxy.top/";
    }

    public final static String getHost() {
        if (isDebug) {
            return "http://localhost:8080";
        } else {
            return "https://www.crazytalking.top";
        }
    }

    public final static String getVersion() {
        if (isDebug) {
            return DateUtils.dateToString(new Date(), DateUtils.dateStringType1);
        } else {
            return "20190404";
        }
    }

    public static final LinkedHashMap<String, String> languageList = new LinkedHashMap<>();

    static {
        languageList.put("en", "english");
        languageList.put("zh-Hans", "简体中文");
    }


    public static class Client {
        public static String success = "1";
        public static String error = "-1";
        public static String needLogin = "-2";
    }

    public static class Service {
        public static int success = 1;
        public static int error = -1;
    }
}
