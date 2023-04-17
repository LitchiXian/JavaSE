package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String name = "jack";

    public void f1() {
        class B {
            private String name = "litchi";

            public void show() {
                System.out.println("B.name = " + name + "; A.name = " + A.this.name);
            }

            ;
        }
        new B().show();
    }
}