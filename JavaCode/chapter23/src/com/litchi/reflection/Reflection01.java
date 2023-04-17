package com.litchi.reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {


        Properties properties = new Properties();

        FileReader fileReader = new FileReader("src\\re.properties");
        properties.load(fileReader);
        if (fileReader == null){
            System.out.println("null and fileReader.close");
            fileReader.close();
        }
        fileReader.close();

        String classfullpath = properties.getProperty("classfullpath");//com.litchi.Cat
        String method = properties.getProperty("method");

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

        //java.lang.reflect.Field: 代表类的成员变量，Field 对象表示某个类的成员变量
        //得到name 字段
        // getField不能得到私有的属性
//        Field name = cls.getField("name");
//        Field name2 = cls.getField("name2");
        Field name3 = cls.getField("name3");//只可以访问public的
//        Field name4 = cls.getField("name4");
        System.out.println(name3.get(o));//传统写法 对象.成员变量, 反射 : 成员变量对象.get(对象)

        //java.lang.reflect.Constructor : 代表类的构造方法, Constructor对象表示构造器
        Constructor constructor = cls.getConstructor();//()中可以指定构造器参数类型，这里是返回无参构造器
        System.out.println(constructor);
        Constructor constructor2 = cls.getConstructor(String.class);//这里传入 String.class 就是String 有参构造器
        System.out.println(constructor2);
    }
}
