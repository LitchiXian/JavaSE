package com.litchi.enum_;

/**
 * @author 林志贤
 * @version 1.0
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        System.out.println(autumn.toString());
        //ordinal() 输出的是该枚举对象的次序/编号，从0开始编号
        System.out.println(autumn.ordinal());
        System.out.println(Season2.values());
        //返回当前枚举类中所有的常量
        Season2[] values = Season2.values();
        for (Season2 s : values) {
            System.out.println(s);
        }
        //valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常！
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
        //compareTo：比较两个枚举常量，比较的就是编号！
        //就是把Season2.AUTUMN对象的编号 - Season2.SPRING 对象的编号
        System.out.println(Season2.SPRING.compareTo(autumn1));
    }
}
