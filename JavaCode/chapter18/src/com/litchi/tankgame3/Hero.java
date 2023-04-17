package com.litchi.tankgame3;

/**
 * @author 林志贤
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank{
    //定义一个Shot 对象
    Shot shot = null;

    public Hero(int x, int y) {
        super(x, y);
        setDirect(0);
    }

    //射击
    public void shotEnemyTank(){
        int x = 0;
        int y = 0;
        switch (this.getDirect()) {
            case 0:
                x = this.getX() + 20;
                y = this.getY();
                break;
            case 1:
                x = this.getX() + 60;
                y = this.getY() + 20;
                break;
            case 2:
                x = this.getX() + 20;
                y = this.getY() + 60;
                break;
            case 3:
                x = this.getX();
                y = this.getY() + 20;
                break;
        }
        shot = new Shot(x, y, this.getDirect());
        //启动我们的Shot线程
        new Thread(shot).start();
    }
}
