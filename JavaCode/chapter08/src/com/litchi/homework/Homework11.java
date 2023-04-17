package com.litchi.homework;

public class Homework11 {
    public static void main(String[] args) {
//        向上转型
        Person02 p = new Student();
        // 可以调用 run eat 从子类找起
//        向下转型
        Student s = (Student) p;
        //可以调用 run eat study从子类找起
    }
}

class Person02 {
    public void run() {
        System.out.println("person run");
    }

    public void eat() {
        System.out.println("person eat");
    }
}

class Student extends Person02 {
    public void run() {
        System.out.println("student run");
    }

    public void study() {
        System.out.println("student study...");
    }
}