package com.litchi.wrapper;

/**
 * @author 林志贤
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // False
        //所以，这里主要是看范围 -128~127 就是直接返回
        Integer m = 1;//底层 Integer.valueOf(1); -> 阅读源码
        Integer n = 1;//底层 Integer.valueOf(1); -> 阅读源码
        System.out.println(m == n);  //True
        //所以，这里主要是看范围 -128~127 就是直接返回
        //否则就 new Integer(xx);
        Integer x = 128;//底层 Integer.valueOf(128); -> 阅读源码
        Integer y = 128;//底层 Integer.valueOf(128); -> 阅读源码
        System.out.println(x == y);  //False
    }
}
