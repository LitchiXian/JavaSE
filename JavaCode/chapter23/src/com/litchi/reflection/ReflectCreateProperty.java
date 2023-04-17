package com.litchi.reflection;

import java.lang.reflect.Field;

/**
 * @author 林志贤
 * @version 1.0
 * 演示反射操作属性
 */
public class ReflectCreateProperty {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        //先获取到 Student 类的Class对象
        Class<?> stuCls = Class.forName("com.litchi.reflection.Student");
        //通过 public 的无参构造器创建实例
        Object o = stuCls.newInstance();
        System.out.println(o.getClass());//Student

        //1.使用反射得到age 属性对象
        Field age = stuCls.getField("age");
        age.set(o, 88);//通过反射来操作属性
        System.out.println(o);
        System.out.println(age.get(o));//返回age属性的值

        //2.使用反射操作name 属性
        Field name = stuCls.getDeclaredField("name");
        //对 name 进行爆破，可以操作 private 属性
        name.setAccessible(true);
        name.set(o, "litchi");
        System.out.println(o);

        name.set(null, "tom");//因为name是static属性，因此 o 也可以写成 null
        System.out.println(o);
        System.out.println(name.get(o));
        System.out.println(name.get(null));
    }
}

class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}