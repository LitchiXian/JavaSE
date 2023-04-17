package com.litchi.enum_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        //使用
        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        Season winter = new Season("冬天", "寒冷");
        //因为对于季节而言，它的对象是固定的，不会有更多
        //按这个思路设计的类，不能体现季节是固定的4个对象
        //因此，这样的设计不好 ====> 枚举类[枚：一个一个  举：举例]
        Season other = new Season("红天", "~~~");


    }
}

class Season{
    private String name;
    private String desc;

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
