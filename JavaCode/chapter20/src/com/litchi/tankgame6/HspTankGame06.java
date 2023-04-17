package com.litchi.tankgame6;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class HspTankGame06 extends JFrame {

    static Scanner sc = new Scanner(System.in);
    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        new HspTankGame06();
    }

    public HspTankGame06() {
        System.out.println("是否新游戏？(1.新游戏 2.上把游戏)");
        String next = sc.next();
        switch (next){
            case "1":
                mp = new MyPanel(true);
                break;
            case "2":
                mp = new MyPanel(false);
                break;
            default:
                System.out.println("请输入正确数字");
                return;
        }

        //将mp 放入到Thread ,并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//把面板(就是游戏的绘图区域)

        this.setSize(1200, 950);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.saveGrade();
            }
        });
    }
}
