package com.litchi;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Cat {

    public Cat() {
        System.out.println("无参构造器");
    }

    public Cat(String name) {
        System.out.println(name + "使用有参构造器");
    }

    private String name = "小化";
    String name2 = "tom";
    public String name3 = "大臣";
    protected String name4 = "tomcat";

    public void hi() {
        //System.out.println("I am a Cat");
    }

    public void cry() {
        System.out.println("I am cry");
    }
}
