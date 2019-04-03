package top.crazytalking.Utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import top.crazytalking.Config.V;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;

public class ServletUtils {
    public static <T> T requestParamToModel(HttpServletRequest request, Class<T> beanClass) {
        try {
            T bean = beanClass.newInstance();
            Field[] fs = beanClass.getDeclaredFields();

            for (Field field : fs) {
                String value = request.getParameter(field.getName());
                if (value != null) {
                    field.set(bean, value);
                }
            }
            return bean;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void putAttribute(HttpServletRequest request, Object obj) {
        Gson gson = new Gson();
        String data = gson.toJson(obj);
        request.setAttribute(V.data, data);
    }

    public static void putAttributeWithDateFormat(HttpServletRequest request, Object obj) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();
        String data = gson.toJson(obj);
        request.setAttribute(V.data, data);
    }

    public static void setViewAndForward(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();

        System.out.println(path);
        req.setAttribute("currentURI", path);
        req.setAttribute("viewJsp", path + ".jsp");
        req.getRequestDispatcher("/admin/common.jsp").forward(req, resp);
    }

}
