package com.litchi.state_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName() + "状态" + t.getState());
        t.start();

        while (Thread.State.TERMINATED != t.getState()) {
            System.out.println(t.getName() + "状态" + t.getState());

            Thread.sleep(500);
        }
        System.out.println(t.getName() + "状态" + t.getState());

        System.out.println("game over");
    }
}

class T extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hahaha " + i);
        }


    }
}