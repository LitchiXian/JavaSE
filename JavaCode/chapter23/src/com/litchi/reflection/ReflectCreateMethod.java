package com.litchi.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ReflectCreateMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //先获取到 Boss 类的Class对象
        Class<?> bossCls = Class.forName("com.litchi.reflection.Boss");
        //通过 public 的无参构造器创建实例
        Object o = bossCls.newInstance();

        //1.调用public的hi方法
//        Method hi = bossCls.getMethod("hi", String.class);//OK
        // 1.1 得到 hi方法 对象
        Method hi = bossCls.getDeclaredMethod("hi", String.class);//OK
        // 1.2 调用方法
        hi.invoke(o, "litchi");

        //2.调用 private say 方法
        // 2.1 得到 say方法 对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        // 2.2 因为say方法是private，所以需要暴破，原理和前面的构造器和属性一样
        say.setAccessible(true);
        // 2.3 调用方法
        System.out.println(say.invoke(o, 1, "tom", '1'));//OK
        System.out.println(say.invoke(null, 2, "tom2", '2'));//OK


        //3 在反射中，如果方法有返回值，统一返回 Object
        Object tom = say.invoke(null, 1, "tom", '2');
        System.out.println(tom.getClass());//和方法定义的返回类型一样//String
    }
}


class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi " + s);
    }
}