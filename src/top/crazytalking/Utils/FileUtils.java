package top.crazytalking.Utils;

import java.io.*;

public class FileUtils {

    public static void fileWrite(String path, String content) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
        writer.write(content);
        writer.flush();
        writer.close();
    }

    public static String fileRead(String htmlPath) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(htmlPath));

        StringBuffer sb = new StringBuffer();
        char[] chars = new char[512];
        int length;
        while ((length = reader.read(chars)) != -1) {
            sb.append(new String(chars, 0, length));
        }
        reader.close();

        return sb.toString();
    }

    public static String getFilePathInSrc(String filePath) {
        return FileUtils.class.getResource("/"+filePath).getFile();
    }
}
