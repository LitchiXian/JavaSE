package com.litchi.object_;

public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;
        System.gc();//主动调用垃圾回收器
        System.out.println("程序退出了");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "被销毁了");
    }
}