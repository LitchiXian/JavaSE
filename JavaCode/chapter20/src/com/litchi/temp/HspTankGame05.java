package com.litchi.temp;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class HspTankGame05 extends JFrame {


    //定义MyPanel
    MyPanel mp = null;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HspTankGame05 hspTankGame05 = new HspTankGame05();
        System.out.println("要进行新游戏，还是继续上把游戏？(1.新游戏 2.继续上把)");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int i = 0;
        try {
            i = Integer.parseInt(next);
        } catch (NumberFormatException e) {
            System.out.println("请输入正确信息(1 or 2).");
            return;
        }
        switch (i){
            case 1:
                hspTankGame05.newGame();
                hspTankGame05.saveGame();
                break;
            case 2:
                hspTankGame05.oldGame();
                hspTankGame05.saveGame();
                break;
            default:
                System.out.println("请输入正确信息(1 or 2).");
        }
    }

    public void saveGame() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\game.dat"));
        HashMap<Integer, Tank> hashMap = new HashMap<>();
//        for (EnemyTank enemyTank : mp.enemyTanks) {
//            hashMap.put(enemyTank.getX(), enemyTank.getY());
//        }
        for (int i = 0; i < mp.enemyTanks.size(); i++) {
            EnemyTank enemyTank = mp.enemyTanks.get(i);
            hashMap.put(i, enemyTank);
        }
        hashMap.put(4,mp.hero);
        oos.writeObject(hashMap);
        oos.close();
    }

    public void newGame(){
        mp = new MyPanel();
        //将mp 放入到Thread ,并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//把面板(就是游戏的绘图区域)

        this.setSize(1200, 950);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void oldGame() throws IOException, ClassNotFoundException {

        mp = new MyPanel(1);
        //将mp 放入到Thread ,并启动
        Thread thread = new Thread(mp);
        thread.start();
        System.out.println("OOOOOld");
        this.add(mp);//把面板(就是游戏的绘图区域)

        this.setSize(1200, 950);
        this.addKeyListener(mp);//让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public HspTankGame05() {
    }
}

class Seat implements Serializable{
    int x;
    int y;
}
