package com.litchi.syn;

/**
 * @author 林志贤
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票 100张票
 */
public class SellTicket {
    public static void main(String[] args) {

//        SellTicket03 sellTicket03 = new SellTicket03();
//        //解决了这个难题 没有超卖... 也没有一票多卖
//        new Thread(sellTicket03).start();
//        new Thread(sellTicket03).start();
//        new Thread(sellTicket03).start();

//        SellTicket04 sellTicket04 = new SellTicket04();
//        //解决了这个难题 没有超卖... 也没有一票多卖
//        new Thread(sellTicket04).start();
//        new Thread(sellTicket04).start();
//        new Thread(sellTicket04).start();

        SellTicket05 sellTicket05 = new SellTicket05();
        //解决了这个难题 没有超卖... 也没有一票多卖
        new Thread(sellTicket05).start();
        new Thread(sellTicket05).start();
        new Thread(sellTicket05).start();

        System.out.println("主程序继续执行中");
    }
}


//实现接口方式, 使用 synchronized 实现线程同步
class SellTicket05 implements Runnable {
    private int ticketNum = 1000;//让多个线程共享 ticketNum
    private boolean loop = true;
    Object obj = new Object();
    //可以把 obj 理解成同一个管理员，去访问的时候，会先文管理员厕所里有没有人

    public void sell() {
        //这个锁，可以是this（当前对象），也可以是其他对象
        synchronized (obj) {
//        synchronized (new Object()) {//得是同一个对象哦，不是同一个对象会超卖
            if (ticketNum <= 0) {
                loop = false;
                return;
            }
            System.out.println("线程=" + Thread.currentThread().getName() + " 卖出1张票，还剩下 " + (--ticketNum) + " 张");
        }
    }


    //同步方法(静态的)的锁为当前类本身 SellTicket05.class
    //不能是对象哦，写 this 都是错的
    public synchronized static void m1(){
    }

    public static void m2(){
        synchronized(SellTicket05.class){
            System.out.println("m2");
        }
    }

    @Override
    public void run() {
        int count = 0;
        while (loop) {
            sell();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }

        System.out.println("票数 " + ticketNum + " " + Thread.currentThread().getName() + "卖了 " + count + " 张票");

    }
}


//实现接口方式, 使用 synchronized 实现线程同步
class SellTicket03 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true;

    //说明
    //1.public synchronized void sell() {} 就是一个同步方法
    //2.这时，锁 在 this 对象
    //3.也可以在代码块上写 synchronized ，同步代码块
    public synchronized void sell() {//同步方法，在同一时刻，只能有一个线程来执行run 方法
//    public  void sell() {//超卖，一张多卖
        if (ticketNum <= 0) {
            loop = false;
            return;
        }
        System.out.println("线程=" + Thread.currentThread().getName() + " 卖出1张票，还剩下 " + (--ticketNum) + " 张");
    }

    @Override
    public void run() {
        int count = 0;
        while (loop) {
            sell();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }

        System.out.println("票数 " + ticketNum + " " + Thread.currentThread().getName() + "卖了 " + count + " 张票");

    }
}


//实现接口方式, 使用 synchronized 实现线程同步
class SellTicket04 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true;

    public void sell() {
        //也可以在代码块上写 synchronized ，同步代码块
        synchronized (this) {
            if (ticketNum <= 0) {
                loop = false;
                return;
            }
            System.out.println("线程=" + Thread.currentThread().getName() + " 卖出1张票，还剩下 " + (--ticketNum) + " 张");
        }
    }

    @Override
    public void run() {
        int count = 0;
        while (loop) {
            sell();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }

        System.out.println("票数 " + ticketNum + " " + Thread.currentThread().getName() + "卖了 " + count + " 张票");

    }
}
