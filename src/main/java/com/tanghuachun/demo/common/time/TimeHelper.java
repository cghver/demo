package com.tanghuachun.demo.common.time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 时间相关的函数
 */
public enum TimeHelper {
    /**
     * 标准时间格式
     */
    FORMAT_1("yyyy-MM-dd HH:mm:ss", ThreadLocal.withInitial(() -> {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    })),
    /**
     * yyMMddHHmmssSSS时间格式
     */
    FORMAT_2("yyMMddHHmmssSSS", ThreadLocal.withInitial(() -> {
        return new SimpleDateFormat("yyMMddHHmmssSSS");
    })),
    /**
     * yyMMddHHmmss时间格式
     */
    FORMAT_3("yyMMddHHmmss", ThreadLocal.withInitial(() -> {
        return new SimpleDateFormat("yyMMddHHmmss");
    })),

    /**
     * yyyy-MM-dd时间格式
     */
    FORMAT_4("yyyy-MM-dd", ThreadLocal.withInitial(() -> {
        return new SimpleDateFormat("yyyy-MM-dd");
    })),
    /**
     * yyyyMMdd时间格式
     */
    FORMAT_5("yyyyMMdd", ThreadLocal.withInitial(() -> {
        return new SimpleDateFormat("yyyyMMdd");
    }));

    private String formatKey;
    private ThreadLocal<DateFormat> dateFormatThreadLocal;

    TimeHelper(String formatKey, ThreadLocal<DateFormat> dateFormatThreadLocal) {
        this.formatKey = formatKey;
        this.dateFormatThreadLocal = dateFormatThreadLocal;
    }


    private ThreadLocal<DateFormat> getDateFormatThreadLocal() {
        return dateFormatThreadLocal;
    }

    /**
     * 获取字符串格式的时间
     *
     * @return string
     */
    public static String longToString(TimeHelper timeHelper, long timestamp) {
        return timeHelper.getDateFormatThreadLocal().get().format(timestamp);
    }

    /**
     * 将字符串的时间转化为时间戳
     * @param timeHelper 时间格式
     * @param formatTime 字符串时间
     * @return
     */
    public static long stringToLong (TimeHelper timeHelper, String formatTime){
        try {
            return timeHelper.getDateFormatThreadLocal().get().parse(formatTime).getTime();
        } catch (ParseException e) {
            return 0;
        }
    }

}
