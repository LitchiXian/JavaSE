package com.litchi.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List col = new ArrayList();

        col.add(new Dog("波奇塔", 10));
        col.add(new Dog("小白", 5));
        col.add(new Dog("小花", 2));

        //使用迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);
        }

        System.out.println();
        //使用增强for
        for (Object o : col) {
            System.out.println("dog=" + o);
        }
    }
}

class Dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}