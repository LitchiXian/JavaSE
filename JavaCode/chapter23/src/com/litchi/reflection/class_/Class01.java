package com.litchi.reflection.class_;

import com.litchi.Cat;

/**
 * @author 林志贤
 * @version 1.0
 * 对Class类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //看看Class类图
        // 1.Class也是类，因此继承了Object类
        //Class

        //2.Class类对象不是new出来的,而是系统创建的[演示]
        //(1)传统new对象
        /* ClassLoader类
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        //Cat cat = new Cat();
        //(2)反射方式, 刚才没有debug到 ClassLoader类的 loadClass，原因是没有注销 Cat cat = new Cat();
        Class<?> cls1 = Class.forName("com.litchi.Cat");
        /* ClassLoader类 仍然是通过 ClassLoader类加载Cat 的Class对象
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */

        //(3)对于某个类的Class类对象 , 在内存中只有一份，因为类只加载一次
        Class<?> cls2 = Class.forName("com.litchi.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class<?> cls3 = Class.forName("com.litchi.Dog");
        System.out.println(cls3.hashCode());

    }
}
