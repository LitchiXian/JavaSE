package com.litchi.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        //这题稍不注意，就掉进陷阱了
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);
        p1.name = "CC";//首先p1在传入set的时候，hash值是(1001,"AA")去算的
        set.remove(p1);//这里删掉的是hash值(1001, "CC")，set里面没有，所以没有删掉！！！！！
        System.out.println(set);//2
        set.add(new Person(1001, "CC"));//加得进去哦
        System.out.println(set);//3
        set.add(new Person(1001, "AA"));//加得进去哦，因为前面那个p1变成了(1001, "CC")
        System.out.println(set);//4
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}