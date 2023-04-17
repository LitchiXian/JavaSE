package com.litchi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 林志贤
 * @version 1.0
 * 演示通过反射机制创建实例
 */
public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //先获取到User类的Class对象
        Class<?> userCls = Class.forName("com.litchi.reflection.User");
        // 2.通过 public 的无参构造器创建实例
        Object o = userCls.newInstance();
        System.out.println(o);
        // 3.通过 public 的有参构造器创建实例
        /*
            constructor 对象就是
            public User(String name){
                this.name = name;
            }
         */
        // 3.1 先得到对应构造器
        Constructor<?> constructor1 = userCls.getConstructor(String.class);
        // 3.2 创建实例，并传入实参
        Object jack = constructor1.newInstance("jack");
        System.out.println(jack);
        // 4.通过非 public 的有参构造器创建实例
        // 4.1 得到private的构造器
        Constructor<?> constructor2 = userCls.getDeclaredConstructor(int.class, String.class);
        // 4.2 创建实例
        //暴破，使用反射可以访问private构造器/方式/属性 , 反射面前，都是纸老虎
        constructor2.setAccessible(true);
        Object litchi = constructor2.newInstance(30, "litchi");
        System.out.println(litchi);


    }
}

class User{
    private int age = 10;
    private String name = "tom";

    public User() {
    }

    public User(String name){
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
