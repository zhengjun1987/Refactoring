package utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/16 9:51
 */
public class DateFormatUtils {
    private DateFormatUtils() {
        throw new UnsupportedOperationException();
    }

    private static SimpleDateFormat sDateFormat = new SimpleDateFormat();

    /**
     * 将时间timeMillis的long值转换成相应格式的字符串
     * @param pDateFormatEnum 时间格式枚举
     * @param pTimeMillis 代表时间的long值
     * @return 代表时间的格式化字符串
     * @author Zheng Jun
     */
    public static String getCurrentTimeString(DateFormatEnum pDateFormatEnum, long pTimeMillis){
        sDateFormat.applyPattern(pDateFormatEnum.getFormat());
        return sDateFormat.format(pTimeMillis);
    }

    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "DateFormatUtils.getCurrentTimeString(DateFormatEnum.AME_2_MIN) = " + DateFormatUtils.getCurrentTimeString(DateFormatEnum.AME_2_MIN, System.currentTimeMillis()));
        System.out.println(MyUtils.getCurrentTime() + "DateFormatUtils.getCurrentTimeString(DateFormatEnum.AME_STD) = " + DateFormatUtils.getCurrentTimeString(DateFormatEnum.AME_STD, System.currentTimeMillis()));
        System.out.println(MyUtils.getCurrentTime() + "DateFormatUtils.getCurrentTimeString(DateFormatEnum.CHN_2_MIN) = " + DateFormatUtils.getCurrentTimeString(DateFormatEnum.CHN_2_MIN, System.currentTimeMillis()));
        System.out.println(MyUtils.getCurrentTime() + "DateFormatUtils.getCurrentTimeString(DateFormatEnum.CHN_STD) = " + DateFormatUtils.getCurrentTimeString(DateFormatEnum.CHN_STD, System.currentTimeMillis()));
        System.out.println(MyUtils.getCurrentTime() + "DateFormatUtils.getCurrentTimeString(DateFormatEnum.LOG) = " + DateFormatUtils.getCurrentTimeString(DateFormatEnum.LOG, System.currentTimeMillis()));
    }
//            2018-03-16 10:08:52:385  DateFormatUtils.getCurrentTimeString(DateFormatEnum.AME_2_MIN) = 2018-03-16 10:08
//            2018-03-16 10:08:52:386  DateFormatUtils.getCurrentTimeString(DateFormatEnum.AME_STD) = 2018-03-16 10:08:52
//            2018-03-16 10:08:52:387  DateFormatUtils.getCurrentTimeString(DateFormatEnum.CHN_2_MIN) = 2018年03月16日 10:08
//            2018-03-16 10:08:52:387  DateFormatUtils.getCurrentTimeString(DateFormatEnum.CHN_STD) = 2018年03月16日 10:08:52
//            2018-03-16 10:08:52:387  DateFormatUtils.getCurrentTimeString(DateFormatEnum.LOG) = 2018-03-16 10:08:52:387
}
