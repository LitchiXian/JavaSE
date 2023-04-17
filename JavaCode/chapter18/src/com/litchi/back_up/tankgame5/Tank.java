package com.litchi.back_up.tankgame5;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Tank {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标
    private int direct;//坦克方向 0上  1右  2下  3左
    private int speed = 1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.direct = 2;
    }

    //上右下左移动方法
    public boolean moveUp() {
        if (y < 0)
            return false;
        y -= speed;
        return true;
    }

    public boolean moveRight() {

        if (x > 920)
            return false;
        x += speed;
        return true;
    }

    public boolean moveDown() {

        if (y > 670)
            return false;
        y += speed;
        return true;
    }

    public boolean moveLeft() {

        if (x < 0)
            return false;
        x -= speed;
        return true;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
