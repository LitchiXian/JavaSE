package com.litchi.homework;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> fileCls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File的构造器=" + declaredConstructor);
        }
        System.out.println("=======================");
        Constructor<?> constructor = fileCls.getConstructor(String.class);
        File file = (File) constructor.newInstance("d:\\workspace\\mynew.txt");

        try {
            file.createNewFile();
            System.out.println("success");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
