package top.crazytalking.www;

import com.sun.mail.util.MailSSLSocketFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import top.crazytalking.www.bean.Language;
import top.crazytalking.www.config.C;
import top.crazytalking.www.config.V;
import top.knxy.library.utils.FileUtils;
import top.knxy.library.utils.LogUtils;
import top.knxy.library.utils.TextUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Properties;

import org.springframework.core.io.Resource;

@Controller
public class AppController {
    public final static String TAG = "AppController";

    @GetMapping(value = {"/", "*.html"})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String uri = request.getRequestURI();
        if ("/".equals(uri)) {
            uri += "index.html";
        }

        String languageCode = getCookie(request, V.language);
        if (!C.languageList.containsKey(languageCode)) {
            languageCode = "en";
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(V.languageName, getLanguageName(languageCode));
        modelAndView.addObject(V.languageList, C.languageList);
        modelAndView.addObject(V.languageCode, languageCode);
        modelAndView.addObject(V.data, getLanguageBean(languageCode));
        modelAndView.setViewName(uri.substring(1, uri.lastIndexOf(".html")));
        return modelAndView;
    }

    @GetMapping("/en/*.html")
    public ModelAndView en(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return toLanguage(request, response, "en");
    }

    @GetMapping("/zh-Hans/*.html")
    public ModelAndView zh_chs(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return toLanguage(request, response, "zh-Hans");
    }

    private ModelAndView toLanguage(HttpServletRequest request,
                                    HttpServletResponse response,
                                    String languageCode
    ) throws Exception {
        Cookie cookie = new Cookie(V.language, languageCode);
        cookie.setPath("/");
        response.addCookie(cookie);

        String uri = request.getRequestURI();
        if (("/" + languageCode + "/").equals(uri)) {
            uri += "index.html";
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(V.languageName, getLanguageName(languageCode));
        modelAndView.addObject(V.languageList, C.languageList);
        modelAndView.addObject(V.languageCode, languageCode);
        modelAndView.addObject(V.data, getLanguageBean(languageCode));
        modelAndView.setViewName(uri.substring(2 + languageCode.length(), uri.lastIndexOf(".html")));
        return modelAndView;
    }


    @PostMapping("/send_message.html")
    public ModelAndView sendEmail(HttpServletRequest request, HttpServletResponse response,
                                  @RequestParam("name") String name,
                                  @RequestParam("email") String email,
                                  @RequestParam("tel") String tel,
                                  @RequestParam("need") String need
    ) throws Exception {
        String to = "me@knxy-inc.com";
        String from = "732526912@qq.com";
        String host = "smtp.qq.com";
        Properties properties;
        properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");


        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);

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

        Language language = getLanguageBean(request);

        ModelAndView mv = new ModelAndView();
        mv.addObject(V.msg, language.getContact().getForm().getResponse().getTitle());
        mv.addObject(V.link, language.getContact().getForm().getResponse().getLink());
        mv.setViewName("contact/message");
        return mv;
    }

    private Language getLanguageBean(HttpServletRequest request) throws Exception {
        String languageCode = getCookie(request, V.language);
        if (!C.languageList.containsKey(languageCode)) {
            languageCode = "en";
        }

        return getLanguageBean(languageCode);
    }

    private Language getLanguageBean(String languageCode) throws Exception {
        Language data = new Gson().fromJson(getLanguageText(languageCode), Language.class);
        return data;
    }

    private String getLanguageName(String languageCode) {
        return C.languageList.get(languageCode);
    }

    private String getLanguageText(String languageCode) throws Exception {


        Resource resource = new ClassPathResource("classpath:language/L_" + languageCode + ".json");
        File file = resource.getFile();
        LogUtils.i(TAG, file.getPath());
        return FileUtils.fileRead(file.getPath());
    }

    public static String getCookie(HttpServletRequest request, String name) throws Exception {
        if (TextUtils.isEmpty(name)) {
            return null;
        }

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}
