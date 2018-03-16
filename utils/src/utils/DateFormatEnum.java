package utils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/16 9:53
 */
public enum DateFormatEnum {
    LOG("yyyy-MM-dd HH:mm:ss:SSS  "),
    AME_STD("yyyy-MM-dd HH:mm:ss"),
    AME_2_MIN("yyyy-MM-dd HH:mm"),
    CHN_STD("yyyy年MM月dd日 HH:mm:ss"),
    CHN_2_MIN("yyyy年MM月dd日 HH:mm");
    private String format;

    DateFormatEnum(String pFormat) {
        format = pFormat;
    }

    String getFormat() {
        return format;
    }
}
