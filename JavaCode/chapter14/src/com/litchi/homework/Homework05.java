package com.litchi.homework;

import java.util.TreeSet;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person1());//会抛异常，因为该 类没有实现 Comparable 接口
        //解决方法
        //1.在创建 treeSet 对象时候，传入匿名内部类对象
        //2.Person1 类 去实现 Comparable 接口
    }
}

class Person1{}