package com.litchi.wrapper;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示 int <--> Integer 的装箱和拆箱
        //手动装箱 int -> Integer
        int n1 = 100;
        Integer integer1 = new Integer(n1);
        Integer integer2 = Integer.valueOf(n1);

        //手动拆箱 Integer -> int
        int i = integer1.intValue();

        //自动装箱 和 自动拆箱
        int n2 = 200;
        //自动装箱
        Integer integer3 = n2;//底层使用的是Integer.valueOf(n2);
        //自动拆箱
        int n3 = integer3;//底层仍然使用的是intValue()方法
    }
}
