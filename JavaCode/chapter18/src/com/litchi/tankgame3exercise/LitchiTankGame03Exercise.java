package com.litchi.tankgame3exercise;


import javax.swing.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class LitchiTankGame03Exercise extends JFrame {
    //定义 MyPanel
    MyPanel mp;

    public static void main(String[] args) {
        new LitchiTankGame03Exercise();
    }

    public LitchiTankGame03Exercise() {
        mp = new MyPanel();
        //将时间监听者加入
        functionTimeMonitor();
        this.add(mp);//面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);//让 JFrame 监听 mp 的键盘事件

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void functionTimeMonitor() {
        TimeMonitor1 timeMonitor1 = new TimeMonitor1(mp);
        TimeMonitor2 timeMonitor2 = new TimeMonitor2(mp.heroSlugs, mp.enemySlugs);
        TimeMonitor3 timeMonitor3 = new TimeMonitor3(mp.enemyTanks, mp.enemySlugs);
        timeMonitor1.setDaemon(true);
        timeMonitor2.setDaemon(true);
        timeMonitor3.setDaemon(true);
        timeMonitor1.start();
        timeMonitor2.start();
        timeMonitor3.start();
    }

}
