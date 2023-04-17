package com.litchi.reflection.question;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 林志贤
 * @version 1.0
 * 反射问题的引入
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi

        //传统的方式 new 对象 -> 调用方法
//        Cat cat = new Cat();
//        cat.hi(); ===> cat.cry() 修改源码

        //尝试使用所学知识解决
        //思路分析
        // 1.将 re.properties 的相关信息读取出来
        Properties properties = new Properties();
        try {
            FileReader fileReader = new FileReader("src\\re.properties");
            properties.load(fileReader);
//            properties.list(System.out);
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String classfullpath = properties.getProperty("classfullpath");//com.litchi.Cat
        String method = properties.getProperty("method");
        System.out.println(classfullpath);
        System.out.println(method);

        // 2.创建对象，传统方法实现不了，行不通 ==》反射机制
//        Cat cat2 = new com.litchi.Cat();//com.litchi.Cat
        //new classfullpath()//干不了

        // 3.使用反射机制解决(快速入门)
        // (1)加载类, 返回 Class 类型的对象
        Class cls = Class.forName(classfullpath);
        // (2)通过 cls 得到你加载的类 com.litchi.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型" + o.getClass());
        // (3)通过 cls 得到你加载的类 com.litchi.Cat 的 method"hi" 的方法对象
        //      即：在反射中，可以把方法视为对象(万物皆对象)
        Method method1 = cls.getMethod(method);
        // (4)通过 method1 调用方法：即通过方法对象来实现调用方法
        System.out.println("=============");
        method1.invoke(o);//传统方法 对象.方法() , 反射机制 方法.invoke(对象)

    }
}
