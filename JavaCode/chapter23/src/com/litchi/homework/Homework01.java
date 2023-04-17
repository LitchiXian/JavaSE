package com.litchi.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> testCls = Class.forName("com.litchi.homework.PrivateTest");
        Object o = testCls.newInstance();

        //活得属性 name，并且修改，因为是私有，还需要暴破
        Field name = testCls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "我才是HelloKitty");

        Method getName = testCls.getMethod("getName");
        System.out.println(getName.invoke(o));

        System.out.println(((PrivateTest) o).getName());


        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTest = privateTestClass.newInstance();
        Field name1 = privateTestClass.getDeclaredField("name");
        name1.setAccessible(true);
        name.set(privateTest, "KT猫");

        Method getName1 = privateTestClass.getMethod("getName");
        System.out.println(getName1.invoke(privateTest));

        System.out.println(privateTest.getName());

    }
}

class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }

}