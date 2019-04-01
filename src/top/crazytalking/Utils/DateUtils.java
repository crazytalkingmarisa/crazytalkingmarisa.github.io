package top.crazytalking.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * this project has 2 site to use datetime  
 * 1. database return and send
 * 		date id ---> return from database: long, TimeStamp
 * 				  ---> send to database: 	 long, TimeStamp
 * 2. client push to server or receive form server
 * 		date id ---> send to client: String , TimeStamp
 * 				  ---> receive from client: String , TimeStamp
 * @author faddenyin
 *
 */

public class DateUtils{
    public static String   dateStringType1 = "yyyyMMddHHmmss";
    public static String   dateStringType2 = "yyyy-MM-dd HH:mm:ss";
    public static String   dateStringType3 = "yyyy-MM-dd HH:mm:ss EEEE";
    public static String[] weekDays        = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};

    public static String dateToString(Date date,String type){
        SimpleDateFormat sdf = new SimpleDateFormat(type);
        String str = sdf.format(date);
        return str;
    }

    public static Date stringToDate(String strDate,String type){
        if (strDate==null) return null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(type);
            Date date = sdf.parse(strDate);
            return date;
        } catch (Exception e) {
            return null;
        }
    }

    public static String stringToString(String strDate,String newType,String oldType){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(oldType);
            Date date = sdf.parse(strDate);
            sdf = new SimpleDateFormat(newType);
            String newDate = sdf.format(date);
            return newDate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getWeek(String date,String type){
        try {
            Date Date = stringToDate(date,type);
            Calendar cal = Calendar.getInstance();
            cal.setTime(Date);
            int w = cal.get(Calendar.DAY_OF_WEEK)-1;
            if (w<0) w = 0;
            return weekDays[w];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getHourOffset(Date lastFailTime,Date date){
        // TODO Auto-generated method stub
        return 0;
    }

}
