package com.litchi.poly_.objectpoly_;

public class Animal {
    public void cry(){
        System.out.println("Animal cry ...");
    }
}

class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("Dog cry ....");
    }
}

class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("Cat cry ....");
    }
}