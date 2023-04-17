package com.litchi.super_;

public class Super01 {
    public static void main(String[] args) {
        B b = new B();
        b.sum();
    }
}

class A{
    public void cal(){
        System.out.println("A 类的cal（）方法……");
    }
}

class B extends A{

    public void cal(){
        System.out.println("B 类的cal（）方法……");
    }

    public void sum(){
        super.cal();
        this.cal();
        cal();
    }
}

class C extends B{
    public void cal(){
        System.out.println("B 类的cal（）方法……");
    }

    public void sum(){
        super.cal();
//        super.super.cal();没有这个方法
        this.cal();
        cal();
    }
}