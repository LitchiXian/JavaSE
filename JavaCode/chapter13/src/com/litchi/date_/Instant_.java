package com.litchi.date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {

        //1.通过 静态方法 now() 获取当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2.通过 from 可以把 Instant 转成 Date
        Date date = Date.from(now);
        System.out.println(date);
        //3.通过 date 的toInstant() 可以把 Date 转成 Instant对象
        Instant instant = date.toInstant();
        System.out.println(instant);
    }
}
