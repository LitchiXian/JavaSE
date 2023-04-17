package com.litchi.threaduse;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();//启动线程 -> 最终会执行 cat 的 run 方法
        //老韩读源码
        /*
            (1)
            public synchronized void start() {
                start0();
            }
            (2)
            //start0() 是 native 本地方法，是 JVM 调用，底层是 c/c++ 实现
            //真正实现多线程的效果，是 start0(), 而不是 run
            private native void start0();
         */
//        cat.run();//执行看看就知道了
        //说明：当main 线程启动一个子线程 Thread-0,主线程不会阻塞，会继续执行
        //这时，主线程和子线程是交互执行...

        System.out.println("主线程继续执行 name=" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            try {
                //让主线程休眠
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//说明
//1.当一个类继承了 Thread 类， 该类就可以当成线程使用
//2.我们会重写 run 方法，写上自己的业务代码
//3.run Thread 类 实现了 Runnable 接口的 run 方法
/*
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread {
    int times;

    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        while (true) {
            //该线程每隔一秒，在控制台输出 ”喵喵，我是小猫咪“
            System.out.println("喵喵，我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            //让该线程休眠 1 秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;//当times 到8，退出while，这时线程也就退出了
            }
        }
    }
}