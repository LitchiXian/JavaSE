package com.litchi.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

interface A0{
    //写属性
    int n1 = 10;
    //写方法,在接口中，抽象方法可以省略abstract关键字
    public void work1();

    //jdk8.0后接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现
    //需要使用default关键字修饰
    public default void work2(){
        System.out.println("ok....");
    }

    public static void work3(){
        System.out.println("静态方法");
    }
}

class A00 implements A0{
    @Override
    public void work1() {
        System.out.println("work1().....");
    }
}