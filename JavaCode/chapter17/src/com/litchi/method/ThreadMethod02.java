package com.litchi.method;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();
        for (int i = 0; i <= 20; i++) {
            Thread.sleep(500);

            System.out.println(Thread.currentThread().getName() + "在吃包子---" + i);
            if (i == 5) {
                System.out.println(Thread.currentThread().getName() + "大哥先吃");
                //join 线程插队
                //t2.join();//这里相当于让 t2 线程先执行完毕//即线程死亡

                Thread.yield();//礼让，不一定成功...
                System.out.println("大哥吃完，小弟我" + Thread.currentThread().getName() + "继续吃");
            }
        }
    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "在吃包子---" + i);
        }
    }
}
