package com.hrio.springboot.basis.exception.example.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 时间处理工具类
 *
 * @author zhanghl
 * @date 2022/05/27
 */
public class DateUtil {

    /**
     * 获取精确到秒的时间戳
     *
     * @return long类型时间戳
     */
    public static long getTimeMills() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        return LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), localTime.getHour(), localTime.getMinute(), localTime.getSecond())
                .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
