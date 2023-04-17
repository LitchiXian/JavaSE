package com.litchi.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class DrawCircle extends JFrame {//JFrame 对应窗口，可以理解成是一个画框
    //定义一个面板
    private MyPanel myPanel = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        myPanel = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(myPanel);
        //设置窗口的大小
        this.setSize(400, 400);
        //当点击窗口的小X，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//1.先定义一个面板 MyPanel，继承 JPanel 类，画图形，就在面板上画
class MyPanel extends JPanel {

    //说明：
    // 1.MyPanel 对象就是一个面板
    // 2.Graphics g 把 g 理解成画笔
    // 3.Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
//        System.out.println("paint 方法被调用了");
        //画一个圆形
        g.drawOval(10, 10, 100, 100);
    }
}