package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}