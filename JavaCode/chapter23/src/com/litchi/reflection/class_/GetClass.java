package com.litchi.reflection.class_;

import com.litchi.Car;

/**
 * @author 林志贤
 * @version 1.0
 * 演示得到Class对象的各种方式(6)
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Class.forName
        String classAllPath = "com.litchi.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        // 2.通过类的class获取,应用场景:用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);
        // 3.实例的getClass(),应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);
        // 4.通过类加载器【4种】来获取到类的Class对象
        //(1)先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1、cls2、cls3、cls4 其实是通过一对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //5.基本数据(int，char，boolean，float，double，byte，long，short) 按如下方式得到 Class 类对象
//        Class cls = int.class;
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;

        System.out.println(integerClass);//int//自动装箱 自动拆箱

        //6.基本数据类型对应的包装类，可以通过 .TYPE 得到 Class 类对象
        Class<Integer> type = Integer.TYPE;
        Class<Double> type1 = Double.TYPE;

        System.out.println(type);

        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());

    }
}
