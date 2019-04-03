package top.crazytalking.Utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

public class WebUtils {


    public static String requestGet(String urlString, Map<String, String> data) throws Exception {// 创建URL对象，xxx是服务器API

        Set<String> keySet = data.keySet();
        StringBuilder sb = new StringBuilder();
        sb.append(urlString).append("?");
        for (String key : keySet) {
            String value = data.get(key);
            if (value == null) value = "";
            value = URLEncoder.encode(value, "UTF-8");
            sb.append(key);
            sb.append("=");
            sb.append(value);
            sb.append("&");
        }
        sb.deleteCharAt(sb.length() - 1);
        return requestGet(sb.toString());
    }

    public static String requestGet(String urlString) throws Exception {
        HttpURLConnection conn = getConnectionSetting(urlString, "GET");
        return getString(conn);
    }


    public static String requestPost(String urlString, String data) throws Exception {
        HttpURLConnection conn = getConnectionSetting(urlString, "POST");
        OutputStream op = conn.getOutputStream();
        op.write(data.getBytes());
        return getString(conn);
    }

    public static <T> T requestPost(String urlString, String data, Class<T> cls) throws Exception {
        HttpURLConnection conn = getConnectionSetting(urlString, "POST");
        OutputStream op = conn.getOutputStream();
        op.write(data.getBytes());
        String str = getString(conn);
        return XmlUtils.xmlStrToBean(str,cls);
    }

    private static HttpURLConnection getConnectionSetting(String urlString, String method) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        conn.setConnectTimeout(5000);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        return conn;
    }

    private static String getString(HttpURLConnection conn) throws Exception {
        int code = conn.getResponseCode();
        if (code == 200) {
            InputStream in = conn.getInputStream();
            StringBuffer sb = new StringBuffer();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = in.read(bytes)) != -1) {
                sb.append(new String(bytes, 0, len, "utf-8"));
            }
            in.close();
            return sb.toString();
        } else {
            throw new Exception("statu = " + code);
        }
    }
}
