package com.litchi.enum_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);
        System.out.println(Season1.SUMMER);
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.WINTER);
    }
}

//演示自定义枚举实现
class Season1 {
    private String name;
    private String desc;

    //定义了四个对象
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    //1.将构造器私有化，目的防止 直接 new
    //2.去掉setXxx方法，防止属性被修改
    //3.在Season1 内部，直接创建固定的对象
    //4.优化，可以加入 final 来修饰
    private Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    //2.去掉setXxx方法，防止属性被修改
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
