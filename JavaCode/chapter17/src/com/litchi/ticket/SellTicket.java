package com.litchi.ticket;

/**
 * @author 林志贤
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票 100张票
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        //这里我们会出现 超卖.. 一票多卖..
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

//        SellTicket02 sellTicket02 = new SellTicket02();
//        //这里我们还是会出现 超卖.. 一票多卖..
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();



        System.out.println("主程序继续执行中");
    }
}


//使用 Thread 方式
class SellTicket01 extends Thread {
    private static int ticketNum = 100;//让多个线程共享 ticketNum

    @Override
    public void run() {
        int count = 0;
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票数 " + ticketNum + " " + Thread.currentThread().getName() + "卖了 " + count + " 张票");
                break;
            }
            System.out.println("线程=" + Thread.currentThread().getName() + " 卖出1张票，还剩下 " + (--ticketNum) + " 张");
            count++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

//实现接口方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum

    @Override
    public void run() {
        int count = 0;
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票数 " + ticketNum + " " + Thread.currentThread().getName() + "卖了 " + count + " 张票");
                break;
            }
            System.out.println("线程=" + Thread.currentThread().getName() + " 卖出1张票，还剩下 " + (--ticketNum) + " 张");
            count++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}