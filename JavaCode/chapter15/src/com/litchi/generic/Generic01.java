package com.litchi.generic;

import java.util.ArrayList;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Generic01 {
    public static void main(String[] args) {
        //使用传统的方法来解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("波奇塔", 3));
        arrayList.add(new Dog("小白", 2));
        arrayList.add(new Dog("小黑", 4));

        //假如我们的程序员，不小心，添加了一只猫
        arrayList.add(new Cat());

        for (Object o : arrayList) {
            //向上转型 Object -> Dog
            Dog dog = (Dog) o;
            //这只猫在转型的时候就会报异常
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat{}