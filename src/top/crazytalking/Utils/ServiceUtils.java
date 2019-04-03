package top.crazytalking.Utils;

import top.crazytalking.Config.C;
import top.crazytalking.Config.S;
import top.crazytalking.Service.BaseService;

import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

public class ServiceUtils {

    public static String getUUid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }


    public static void createError(BaseService model) {
        model.code = C.Service.error;
        model.msg = "处理异常";
    }

    public static void createError(BaseService model, String msg) {
        model.code = C.Service.error;
        model.msg = msg;
    }

    public static void createError(BaseService model, int code, String msg) {
        model.code = code;
        model.msg = msg;
    }

    public static void createSuccess(BaseService model) {
        model.code = C.Service.success;
    }


    public static String getWXPaySignValue(TreeMap<Object, Object> map) {
        Set<Object> keySet = map.keySet();
        StringBuilder sb = new StringBuilder();
        for (Object key : keySet) {
            if ("sign".equals(key)) continue;
            sb.append(key).append("=").append(map.get(key)).append("&");
        }
        sb.append("key").append("=").append(S.WCPay.apiKey);
        return PwdUtils.md5(sb.toString()).toUpperCase();
    }

}
