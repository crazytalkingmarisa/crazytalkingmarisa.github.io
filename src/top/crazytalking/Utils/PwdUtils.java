package top.crazytalking.Utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class PwdUtils {


    public static String md5(String str) {
        try {
            if (str == null) return null;
            //定义一个字节数组
            byte[] secretBytes = null;
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            //对字符串进行加密
            md.update(str.getBytes());
            //获得加密后的数据
            secretBytes = md.digest();
            //将加密后的数据转换为16进制数字
            String md5code = new BigInteger(1, secretBytes).toString(16);// 16进制数字
            // 如果生成数字未满32位，需要前面补0
            for (int i = 0; i < 32 - md5code.length(); i++) {
                md5code = "0" + md5code;
            }
            return md5code;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有md5这个算法！");
        }
    }

    public static String sha1(String str) {
        try {
            if (str == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(str.getBytes());
            byte[] bytes = messageDigest.digest();

            int len = bytes.length;
            StringBuilder buf = new StringBuilder(len * 2);
            // 把密文转换成十六进制的字符串形式
            char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int j = 0; j < len; j++) {
                buf.append(hex[(bytes[j] >> 4) & 0x0f]);
                buf.append(hex[bytes[j] & 0x0f]);
            }
            return buf.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String createSalt() {
        UUID uuid = UUID.randomUUID();
        String salt = uuid.toString().replace("-", "");
        salt = salt.substring(0, 12);
        return salt;
    }
}
