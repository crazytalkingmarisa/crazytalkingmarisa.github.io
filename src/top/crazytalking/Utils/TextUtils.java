package top.crazytalking.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils {

    public static boolean isEmpty(String str) {
        if (str == null || str.length() < 1 || str.trim().length() < 1)
            return true;
        return false;
    }

    public static boolean isNumeric(String str) {
        if(isEmpty(str)){
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }


}
