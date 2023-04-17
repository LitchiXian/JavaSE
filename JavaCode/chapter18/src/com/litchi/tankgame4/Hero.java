package com.litchi.tankgame4;

/**
 * @author 林志贤
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank {
    //定义一个Shot 对象
    Shot shot = null;

    public Hero(int x, int y) {
        super(x, y);
        setDirect(0);
    }

    //射击
    public void shotEnemyTank(){

        shot = new Shot(this.getX(), this.getY(), this.getDirect());
        //启动我们的Shot线程
        new Thread(shot).start();
    }
}
