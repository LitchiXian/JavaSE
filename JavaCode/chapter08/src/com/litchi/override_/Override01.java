package com.litchi.override_;

public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animal {
//    public void cry() {
    public Object cry() {
        System.out.println("动物叫唤……");
        return null;
    }

    public void sum(){

    }
}

class Dog extends Animal{

    public String cry(){
        System.out.println("小狗汪汪叫……");
        return null;
    }

//     void sum(){}
    public void sum() {
        super.sum();
    }
}