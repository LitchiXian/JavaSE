package com.litchi.enum_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
        //System.out.println(Season2.WHAT);
    }
}

//演示使用enum关键字来实现枚举类
enum Season2 {

    //定义了四个对象
//    public final static Season SPRING = new Season("春天", "温暖");
//    public final static Season SUMMER = new Season("夏天", "炎热");
//    public final static Season AUTUMN = new Season("秋天", "凉爽");
//    public final static Season WINTER = new Season("冬天", "寒冷");
    //如何使用enum 来实现枚举类
    //1.使用关键字 enum 替代 class
    //2.public final static Season SPRING = new Season("春天", "温暖") 直接使用
    //  SPRING("春天", "温暖") 解读 常量名(实参列表)
    //3.如果有多个常量(对象)，使用 , 号间隔即可
    //4.如果使用enum来实现枚举，要求将定义常量对象，写在前面
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷"),
    /*WHAT*/;

    private String name;
    private String desc;

    Season2() {
    }

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

//    @Override
//    public String toString() {
//        return "Season2{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
}
