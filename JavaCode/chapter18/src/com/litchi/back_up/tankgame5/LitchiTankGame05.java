package com.litchi.back_up.tankgame5;


import javax.swing.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class LitchiTankGame05 extends JFrame {
    //定义 MyPanel
    MyPanel mp;

    public static void main(String[] args) {
        new LitchiTankGame05();
    }

    public LitchiTankGame05() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.setDaemon(true);
        thread.start();
        this.add(mp);//面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        this.addKeyListener(mp);//让 JFrame 监听 mp 的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
