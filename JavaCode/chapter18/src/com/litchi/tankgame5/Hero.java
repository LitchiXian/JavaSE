package com.litchi.tankgame5;

import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank {
    //定义一个Shot 对象
    Shot shot = null;
    Vector<Shot> shots = new Vector<>();
    int shotNum = 5;

    public Hero(int x, int y) {
        super(x, y);
        setDirect(0);
    }

    //射击
    public void shotEnemyTank(){

//        if (shotNum == 0)
//            return;
        if (shots.size() == 5)
            return;
        shot = new Shot(this.getX(), this.getY(), this.getDirect());
        //把新建的 shot 放入到 shots
        shots.add(shot);
//        shotNum--;
        //启动我们的Shot线程
        new Thread(shot).start();
    }
}
