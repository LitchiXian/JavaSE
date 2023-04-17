package com.litchi.threaduse;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Thread03 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        new Thread(a).start();
        new Thread(b).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("线程=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class A implements Runnable {
    int count;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world" + Thread.currentThread().getName());
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10)
                break;
        }
    }
}

class B implements Runnable {
    int count;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + Thread.currentThread().getName());
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5)
                break;
        }
    }
}
