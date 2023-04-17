package com.litchi.string_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        Person p2 = new Person();
        p2.name = "jack";

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);//True//堆中的p对象的name存放常量池里的地址，所以两个地址一样
        System.out.println(p1.name == "jack");//True//p1.name存放的是常量池里的地址

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);
    }
}

class Person{
    public String name;
}