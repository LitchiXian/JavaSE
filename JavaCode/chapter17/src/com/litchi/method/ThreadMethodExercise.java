package com.litchi.method;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
            if (i == 4){
                //TODO 插队
                T3 t3 = new T3();
                Thread thread = new Thread(t3);
                thread.start();
                thread.join();
                System.out.println("子线程介绍...");
            }
        }
        System.out.println("主线程介绍...");
    }
}

class T3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello " + i);
        }
    }
}