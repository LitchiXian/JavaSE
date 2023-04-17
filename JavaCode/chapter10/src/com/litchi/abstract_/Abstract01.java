package com.litchi.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        Cat hua = new Cat("hua");
    }
}

abstract class Animal{
    public static int a = 1;
    private String name;

    {
        System.out.println("Animal { }");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("我是 " + getName() + ",我要吃小鱼");
    }
}