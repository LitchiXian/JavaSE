package com.litchi.exit;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ThreadExit_ {
    public static void main(String[] args) {
        T t = new T();
        new Thread(t).start();

        //如果希望main线程去控制 t 线程的终止，就操作 t 的 loop
        //让 t 退出 run 方法，从而终止 t1 线程 -> 通知方法
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        t.setLoop(false);
    }
}

class T implements Runnable{

    private boolean loop = true;
    @Override
    public void run() {
        int n1 = 0;
        while (loop){
            System.out.println("喵喵" + (++n1));
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}