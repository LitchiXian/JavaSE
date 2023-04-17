package com.litchi.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(B.c);
    }
}

class A {
    public int b = getB();
    public static int a = getA();

    static {
        System.out.println("A的static {}");
    }

    {
        System.out.println("A的{}");
    }

    public static int getA() {
        System.out.println("A的getA，初始化a");
        return 10;
    }

    public int getB() {
        System.out.println("A的getB，初始化b");
        return 10;
    }

    public A() {
        System.out.println("A的构造方法");
    }
}

class B extends A {
    public int d = getD();
    public static int c = getC();

    static {
        System.out.println("B的static {}");
    }

    {
        System.out.println("B的{}");
    }

    public static int getC() {
        System.out.println("B的getC，初始化c");
        return 10;
    }

    public int getD() {
        System.out.println("B的getD，初始化d");
        return 10;
    }

    public B() {
        System.out.println("B的构造方法");
    }
}
