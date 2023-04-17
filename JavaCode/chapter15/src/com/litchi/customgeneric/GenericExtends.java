package com.litchi.customgeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");
        //泛型不具备继承性
//        List<Object> list = new ArrayList<String>();//对吗?//错误

        //举例说明下面三个方法的使用
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<A> list3 = new ArrayList<>();
        ArrayList<B> list4 = new ArrayList<>();
        ArrayList<C> list5 = new ArrayList<>();

        //如果是 List<?> c ，可以接收任意的泛型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends A> c  上限是A  可以接受 A 或者 A 子类
//        printCollection2(list1);//x
//        printCollection2(list2);//x
        printCollection2(list3);//Ok
        printCollection2(list4);//Ok
        printCollection2(list5);//Ok

        //List<? super A> c   支持 A 类以及 A 类的父类，不限于直接父类
        printCollection3(list1);//OK
//        printCollection3(list2);//x
        printCollection3(list3);//Ok
//        printCollection3(list4);//x
//        printCollection3(list5);//x
    }

    // ? extends A 表示 上限，可以接受 A 或者 A 子类
    public static void printCollection2(List<? extends A> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
    //说明: List<?> 表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        for (Object object : c) { // 通配符，取出时，就是 Object
            System.out.println(object);
        }
    }
    // ? super 子类类名 A:支持 A 类以及 A 类的父类，不限于直接父类，
//规定了泛型的下限
    public static void printCollection3(List<? super A> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}

class A{}

class B extends A{}

class C extends B{}
