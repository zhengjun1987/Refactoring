package utils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/12 9:55
 */
public class MyUtils {
    public static String getCurrentTime() {
        return DateFormatUtils.getCurrentTimeString(DateFormatEnum.LOG,System.currentTimeMillis());
    }
}
