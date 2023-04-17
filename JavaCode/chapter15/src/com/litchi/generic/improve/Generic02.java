package com.litchi.generic.improve;

import java.util.ArrayList;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Generic02 {
    public static void main(String[] args) {
        //在这里使用泛型来完成
        //1.当我们 ArrayList<Dog> 表示存到 ArrayList 集合中的的元素是 Dog 类型(细节后面说...)
        //2.如果编译器发现添加的类型，不满足要求，就会报错
        //3.在遍历的时候，可以直接取出 Dog 类型，而不是 Object
        //4.public class ArrayList<E>{}   E称为泛型，那么 Dog -> E
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("波奇塔", 3));
        arrayList.add(new Dog("小白", 2));
        arrayList.add(new Dog("小黑", 4));
        //假如我们的程序员，不小心，添加了一只猫
//        arrayList.add(new Cat());

        System.out.println("===使用泛型===");
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + " " + dog.getAge());
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

class Cat {
}