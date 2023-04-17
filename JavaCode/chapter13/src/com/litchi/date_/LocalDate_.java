package com.litchi.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 林志贤
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //1.使用now() 返回当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();//LocalDate.now();//LocalTime.now();
        System.out.println(ldt);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        //2.使用DateTimeFormatter 对象来进行格式化
        //  创建 DateTimeFormatter 对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);

        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();

        //提供 plus 和 minus 方法可以对当前时间进行加或者减
        //看看890天以后，是什么时候
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后：" + dateTimeFormatter.format(localDateTime));
        //看看 在3456分钟前是什么时候
        LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前：" + dateTimeFormatter.format(localDateTime1));
    }
}
