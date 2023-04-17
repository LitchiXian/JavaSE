package com.litchi.tankgame3exercise;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TimeMonitor1 extends Thread{
    private MyPanel mp;

    public TimeMonitor1(MyPanel mp){
        this.mp = mp;
    }

    @Override
    public void run() {
        while (true){
            mp.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
