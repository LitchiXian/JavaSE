package com.litchi.homework;

import java.util.Scanner;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    /*
    思路分析
    1.定义两个线程
    2.第一个线程一直打印100以内的整数（每隔1秒）random
    3.第二个线程获取用户输入，当输入‘Q’，第一个线程结束，第二个线程也结束
    //可以把第二个线程当成main，难度提升是另外一个线程
    走代码
     */
    public static void main(String[] args) {
        A a = new A();
        Thread threada = new Thread(a);
        B b = new B(a);
        Thread threadb = new Thread(b);
        threada.start();
        threadb.start();


        System.out.println("退出了程序");
    }
}


class A implements Runnable {
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = (int) (Math.random() * 100 + 1);
            System.out.println(i);
        }
        System.out.println("A exit");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B implements Runnable{
    private A a;//持有A线程对象，这样可以使用通知方式，结束A线程

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
//        A a = new A();
//        Thread threada = new Thread(a);
//        threada.setDaemon(true);
//        threada.start();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请问是否结束？（是：Q）");
        } while (!sc.next().equals("Q"));
        a.setLoop(false);//通知方式
        System.out.println("B exit");
    }
}