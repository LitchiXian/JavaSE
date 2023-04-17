package com.litchi.method;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果我们希望当main线程结束后，子线程自动结束
        //只需要将 子线程 设置成守护线程即可
        //先设置，再启动
        myDaemonThread.setDaemon(true);

        myDaemonThread.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("休息了 " + i);
        }
        System.out.println("结束啦");
    }
}

class MyDaemonThread extends Thread{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉和送钱快乐聊天，哈哈哈~~~");
        }
    }
}