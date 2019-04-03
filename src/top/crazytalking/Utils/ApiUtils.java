package top.crazytalking.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import top.crazytalking.Bean.Response;
import top.crazytalking.Config.C;
import top.crazytalking.Service.BaseService;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ApiUtils {

    public static String getString(HttpServletRequest request) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = request.getReader();
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public static <T extends BaseService> void doService(Class<T> tClass, JsonObject data, Gson gson, PrintWriter pw) {
        T t = gson.fromJson(data, tClass);
        t.start();
        ApiUtils.response(pw, t);
    }

    public static Response createSuccess() {
        Response response = new Response();
        response.code = C.Client.success;
        return response;
    }


    public static void response(PrintWriter pw, BaseService model) {
        if (model.code == C.Service.success) {
            responseSuccess(pw, model.data);
        } else {
            responseError(pw, model.msg);
        }
    }

    public static void responseError(PrintWriter pw, String msg) {
        responseError(pw, C.Client.error, msg);
    }

    public static void responseError(PrintWriter pw, String code, String msg) {
        Response response = new Response();
        response.code = code;
        response.msg = msg;

        Gson gson = new Gson();
        String jsonStr = gson.toJson(response);

        printString(pw, jsonStr);
    }

    public static void responseSuccess(PrintWriter pw, Object data) {
        Response response = createSuccess();
        response.data = data;

        Gson gson = new Gson();
        String jsonStr = gson.toJson(response);

        printString(pw, jsonStr);
    }

    public static void responseSuccess(PrintWriter pw, Object data, String dateStringType) {
        Response response = createSuccess();
        response.data = data;

        Gson gson = new GsonBuilder().setDateFormat(dateStringType).create();
        String jsonStr = gson.toJson(response);

        printString(pw, jsonStr);
    }

    public static void responseSuccess(PrintWriter pw) {
        responseSuccess(pw, null);
    }

    public static void printString(PrintWriter pw, String str) {
        System.out.println(str);
        pw.print(str);
        pw.close();
    }

}