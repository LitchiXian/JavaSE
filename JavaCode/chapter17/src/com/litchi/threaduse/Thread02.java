package com.litchi.threaduse;

/**
 * @author 林志贤
 * @version 1.0
 * 通过实现接口 Runnable 来开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        //dog.start(); 这里不能调用start
//        //创建了 Thread 对象，把 dog 对象(实现Runnable)，放入 Thread
//        Thread thread = new Thread(dog);
//        thread.start();//这里底层使用了 设计模式[代理模式]（静态代理模式）
//
//        System.out.println("程序继续中");
//        for (int i = 0; i < 30; i++) {
//            System.out.println("主线程 i=" + i + " 线程名=" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        Tiger tiger = new Tiger();//实现了 Runnable
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal{}
class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫..");
    }
}

//线程代理类，模拟一个极简的 Thread 类
class ThreadProxy implements Runnable{//你可以把 ThreadProxy 当作 Thread
    private Runnable target = null;//属性，类型是 Runnable

    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();//这个方法时候真正实现多线程方法
    }
    public void start0(){
        run();
    }
}

class Dog implements Runnable {//通过实现 Runnable 接口，开发线程
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫 " + (++count) + " 线程名=" + Thread.currentThread().getName());
            try {
                //休眠 1 秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}