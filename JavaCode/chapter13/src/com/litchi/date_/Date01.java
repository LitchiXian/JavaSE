package com.litchi.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        //1.获取当前系统时间
        //2.这里的Date 类是在java.util包
        //3.默认输出的日期格式是国外的方式，因此通常需要对格式进行转换
        Date d1 = new Date();//获取当前系统时间
        System.out.println("当前日期 = " + d1);
        Date d2 = new Date(9234567);//通过来指定毫秒数得到时间
        System.out.println(d2);//获取某个时间对应的毫秒数

        //1.创建 SimpleDateFormat对象，可以指定相应的格式
        //2.这里的格式使用的字母是规定好，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期 = " + format);

        //1.可以把一个格式化的String 转成对应的 Date
        //2.得到Date 仍然在输出时，还是国外的形式，如果希望指定格式输出，需要转换
        //3.在把 String -> Date, 使用的 sdf 格式需要和你给的 String 的格式一样，否则会抛出转换异常
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse = " + sdf.format(parse));
    }
}
