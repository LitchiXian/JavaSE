package com.litchi.outputstream_;

import java.io.Serializable;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Dog implements Serializable {
    private String name;
    private int age;
    //序列化对象时，默认将里面所有属性都进行序列化，但除了 static 或 transient 修饰的成员
    private static String color = "write";
    private transient int fee = 3000;
    //序列化对象时，要求**里面属性的类型**也需要实现序列化接口
    private Master master;

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

    public Dog(String name, int age, int fee, Master master) {
        this.name = name;
        this.age = age;
        this.fee = fee;
        this.master = master;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fee=" + fee +
                '}' + color;
    }
}

class Master implements Serializable{

}