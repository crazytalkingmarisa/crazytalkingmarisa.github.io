package top.crazytalking;

import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestParam;
import top.crazytalking.Bean.Request;
import top.crazytalking.Config.V;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.crazytalking.Bean.Language;
import top.crazytalking.Utils.ApiUtils;
import top.crazytalking.Utils.FileUtils;
import top.crazytalking.Utils.TextUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;


@Controller
public class ManagerController {

    @RequestMapping("/*")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Language language = getLanguage(request);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(V.data, language);
        String uri = request.getRequestURI();

        if ("/".equals(uri)) {
            uri += "index.html";
        }
        modelAndView.setViewName(uri.substring(1, uri.lastIndexOf(".html")));
        return modelAndView;
    }

    @RequestMapping("/en/*")
    public ModelAndView en(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return toLanguage(request, response, "1", "en");
    }

    @RequestMapping("/cn/*")
    public ModelAndView cn(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return toLanguage(request, response, "2", "cn");
    }

    private ModelAndView toLanguage(HttpServletRequest request,
                                   HttpServletResponse response,
                                   String languageCode,
                                   String languageValue) throws Exception {
        String str = getFileString("L" + languageCode + ".json");
        Language data = new Gson().fromJson(str, Language.class);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(V.data, data);
        String uri = request.getRequestURI();

        Cookie cookie = new Cookie("language", languageCode);
        cookie.setPath("/");
        response.addCookie(cookie);

        if (("/" + languageValue + "/").equals(uri)) {
            uri += "index.html";
        }

        modelAndView.setViewName(uri.substring(4, uri.lastIndexOf(".html")));
        return modelAndView;
    }

    @RequestMapping("/api")
    public void api(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (!"POST".equals(request.getMethod())) {
            PrintWriter pw = response.getWriter();
            ApiUtils.responseError(pw, "method should be POST");
            return;
        }

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String content = ApiUtils.getString(request);
        PrintWriter pw = response.getWriter();

        Gson gson = new Gson();

        if (TextUtils.isEmpty(content)) {
            ApiUtils.responseError(pw, "input json is empty");
            return;
        }

        Request rq = gson.fromJson(content, Request.class);
        String cmd = rq.cmd;
        JsonObject data = rq.data == null ? new JsonObject() : rq.data;

        if ("C1001".equals(cmd)) {
        } else {
            ApiUtils.responseError(pw, "unknown cmd");
        }
    }

    @RequestMapping("/send_message")
    public ModelAndView sendEmail(HttpServletRequest request, HttpServletResponse response,
                                  @RequestParam("name") String name,
                                  @RequestParam("email") String email,
                                  @RequestParam("tel") String tel,
                                  @RequestParam("need") String need
    ) throws Exception {
        String to = "732526912@qq.com";
        String from = "732526912@qq.com";
        String host = "smtp.qq.com";
        Properties properties;
        properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("732526912@qq.com", "fviazkljvrrwbehe"); //发件人邮件用户名、授权码
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("新的咨询客户");
            message.setText(String.format("name:%s \n email:%s \n tel:%s \n need:%s", name, email, tel, need));
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

        Language language = getLanguage(request);

        ModelAndView mv = new ModelAndView();
        mv.addObject(V.msg, "谢谢你的光顾，我们将会联系你。");
        mv.setViewName("Component/message");
        return mv;
    }

    private Language getLanguage(HttpServletRequest request) throws Exception {
        Cookie[] cookies = request.getCookies();
        String language = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("language".equals(cookie.getName())) {
                    language = cookie.getValue();
                    break;
                }
            }
        }

        String str;
        if ("2".equals(language)) {
            str = getFileString("L2.json");
        } else {
            str = getFileString("L1.json");
        }
        Language data = new Gson().fromJson(str, Language.class);
        return data;
    }

    private String getFileString(String fileName) throws Exception {
        return FileUtils.fileRead(FileUtils.getFilePathInWebInf("/language/" + fileName));
    }
}
