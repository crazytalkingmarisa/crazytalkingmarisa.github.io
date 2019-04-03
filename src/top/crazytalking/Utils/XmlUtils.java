package top.crazytalking.Utils;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Reference: https://www.cnblogs.com/jianlun/articles/4747323.html
 */
public class XmlUtils {


    /**
     * 转化成xml, 单层无嵌套
     *
     * @param map
     * @param isAddCDATA
     * @return
     */
    public static String mapToXmlStr(Map<Object, Object> map, boolean isAddCDATA) {
        StringBuffer strbuff = new StringBuffer("<xml>");
        if (null != map) {
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                strbuff.append("<").append(entry.getKey()).append(">");
                if (isAddCDATA) {
                    strbuff.append("<![CDATA[");
                    if (null != entry.getValue()) {
                        strbuff.append(entry.getValue());
                    }
                    strbuff.append("]]>");
                } else {
                    if (null != entry.getValue()) {
                        strbuff.append(entry.getValue());
                    }
                }
                strbuff.append("</").append(entry.getKey()).append(">");
            }
        }
        return strbuff.append("</xml>").toString();
    }


    /**
     * xml字符串转换成bean对象
     *
     * @param xmlStr xml字符串
     * @param clazz  待转换的class
     * @return 转换后的对象
     */
    public static <T> T xmlStrToBean(String xmlStr, Class<T> clazz) throws Exception {
        // 将xml格式的数据转换成Map对象
        Map<String, Object> map = xmlStrToMap(xmlStr);
        //将map对象的数据转换成Bean对象
        T t = mapToBean(map, clazz);
        return t;
    }

    /**
     * 将xml格式的字符串转换成Map对象
     *
     * @param xmlStr xml格式的字符串
     * @return Map对象
     * @throws Exception 异常
     */
    public static Map<String, Object> xmlStrToMap(String xmlStr) throws DocumentException {
        if (TextUtils.isEmpty(xmlStr)) {
            return null;
        }
        Map<String, Object> map = new HashMap<>();
        //将xml格式的字符串转换成Document对象
        Document doc = DocumentHelper.parseText(xmlStr);
        //获取根节点
        Element root = doc.getRootElement();
        //获取根节点下的所有元素
        List children = root.elements();
        //循环所有子元素
        if (children != null && children.size() > 0) {
            for (int i = 0; i < children.size(); i++) {
                Element child = (Element) children.get(i);
                map.put(child.getName(), child.getTextTrim());
            }
        }
        return map;
    }

    /**
     * 将Map对象通过反射机制转换成Bean对象
     *
     * @param map   存放数据的map对象
     * @param clazz 待转换的class
     * @return 转换后的Bean对象
     * @throws Exception 异常
     */
    public static <T> T mapToBean(Map<String, Object> map, Class<T> clazz) throws Exception {
        T t = clazz.newInstance();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String propertyName = entry.getKey();
                Object value = entry.getValue();
                Field field = getClassField(clazz, propertyName);
                if (field == null) continue;
                Class fieldTypeClass = field.getType();
                value = convertValType(value, fieldTypeClass);
                field.set(t, value);
            }
        }
        return t;
    }

    /**
     * 将Object类型的值，转换成bean对象属性里对应的类型值
     *
     * @param value          Object对象值
     * @param fieldTypeClass 属性的类型
     * @return 转换后的值
     */
    private static Object convertValType(Object value, Class fieldTypeClass) {
        Object retVal = null;
        if (Long.class.getName().equals(fieldTypeClass.getName())
                || long.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Long.parseLong(value.toString());
        } else if (Integer.class.getName().equals(fieldTypeClass.getName())
                || int.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Integer.parseInt(value.toString());
        } else if (Float.class.getName().equals(fieldTypeClass.getName())
                || float.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Float.parseFloat(value.toString());
        } else if (Double.class.getName().equals(fieldTypeClass.getName())
                || double.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Double.parseDouble(value.toString());
        } else {
            retVal = value;
        }
        return retVal;
    }

    /**
     * 获取指定字段名称查找在class中的对应的Field对象(包括查找父类)
     *
     * @param clazz     指定的class
     * @param fieldName 字段名称
     * @return Field对象
     */
    private static Field getClassField(Class clazz, String fieldName) {
        if (Object.class.getName().equals(clazz.getName())) {
            return null;
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }

        Class superClass = clazz.getSuperclass();
        if (superClass != null) {// 简单的递归一下
            return getClassField(superClass, fieldName);
        }
        return null;
    }
}