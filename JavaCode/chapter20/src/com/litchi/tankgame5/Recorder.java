package com.litchi.tankgame5;

import java.io.*;
import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Recorder {
    //定义变量，记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    private static Vector<EnemyTank> enemyTanks = null;
    private static Vector<Node> tankNodes = null;

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    private static BufferedWriter bw;
    private static BufferedReader br;

    public static Vector<Node> getTankNodes() {
        try {
            br = new BufferedReader(new FileReader("src\\grade.txt"));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            String readLen = "";
            tankNodes = new Vector<>();
            while ((readLen = br.readLine()) != null) {
                String[] s = readLen.split(" ");
                Node node = new Node(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                tankNodes.add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tankNodes;
    }

    public static int getGrade() {
        return allEnemyTankNum;
    }

    public static void setGrade(int grade) {
        Recorder.allEnemyTankNum = grade;
    }

    public static void addGrade() {
        allEnemyTankNum++;
    }

    public static void saveGrade() {
        try {
            bw = new BufferedWriter(new FileWriter("src\\grade.txt"));
            bw.write(allEnemyTankNum + "\r\n");
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                String recode = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                bw.write(recode + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
