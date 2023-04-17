package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02 {
    /*
    思路分析
    1.定义一个线程，两个用户公用一张卡（static）
    2.取款是时候，每次取出1000
    3.余额为零就退出
    4.取款的做处理，线程同步问题
     */
    public static void main(String[] args) {
        AA a1 = new AA();
        new Thread(a1).start();
        new Thread(a1).start();
        System.out.println("程序继续中");
    }
}

class AA implements Runnable {
    private static int balance = 10000;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //1.这里使用 synchronized 实现了线程同步
            //2.当多个线程执行到这里时，就回去争夺 obj 对象锁
            //3.哪个线程争夺(获取) obj 对象锁，就执行 synchronized 代码块，执行完后，会释放 obj 对象锁
            //4.争夺不到 obj 对象锁，就 Blocked， 准备继续争夺
            //5.obj 对象锁 是非公平锁
            synchronized (obj) {
                if (balance <= 0) {
                    System.out.println("no money");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "取款1000，还剩 " + (balance -= 1000));
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}