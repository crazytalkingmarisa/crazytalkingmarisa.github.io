package top.crazytalking;

import top.crazytalking.Config.V;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.crazytalking.Utils.FileUtils;
import top.crazytalking.Utils.TextUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ManagerController {

    @RequestMapping("/*")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Cookie[] cookies = request.getCookies();
        String language = null;
        if(cookies !=null) {
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

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(V.data, data);
        String uri = request.getRequestURI();

        //TODO
        if ("/".equals(uri)) {
            uri = "/index.html";
        }
        modelAndView.setViewName(uri.substring(1, uri.lastIndexOf(".html")));

        return modelAndView;
    }

    private String getFileString(String fileName) throws Exception {
        return FileUtils.fileRead(FileUtils.getFilePathInSrc("/language/" + fileName));
    }
}
