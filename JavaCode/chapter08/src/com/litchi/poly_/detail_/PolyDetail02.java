package com.litchi.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说！属性的值看编译类型
        A a = new B();
        System.out.println(a.age);//看编译类型20
        B b = new B();
        System.out.println(b.age);//看编译类型10
    }
}

class A{
    int age = 20;
}

class B extends A{
    int age = 10;
}
