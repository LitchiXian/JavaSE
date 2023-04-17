package com.litchi.reflection;

import com.litchi.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        m1();
        System.out.println("==================");
        m2();
        System.out.println("==================");
        m3();

    }

    //传统方法来调用hi
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法来调用hi 耗时=" + (end - start));
    }

    //反射机制调用hi
    public static void m2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class cls = Class.forName("com.litchi.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制来调用hi 耗时=" + (end - start));
    }

    //反射机制调用hi + 反射调用优化(关闭访问检查)
    public static void m3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class cls = Class.forName("com.litchi.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射机制来调用hi 耗时=" + (end - start));
    }
}
