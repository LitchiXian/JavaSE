package com.litchi.object_;

public class Equals01 {
    public static void main(String[] args) {
        B b = new B();
        A a = b;
        B c = b;
        System.out.println(a == c);
        int n1 = 10;
        double n2 = 10;
        System.out.println(n1 == n2);
        System.out.println("hello".equals("abc"));
    }
}

class A{}
class B extends A{}