package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        new CellPhone().testWork(new Computer() {
            @Override
            public void work(double n1, double n2) {
                System.out.println("我是匿名内部类，我要工作了");
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                System.out.println("工作结束，休息休息");
            }
        }, 10, 8);
    }
}

interface Computer {
    void work(double n1, double n2);
}

class CellPhone {
    public void testWork(Computer computer, double n1, double n2) {
        computer.work(n1, n2);
    }
}