package com.litchi.tankgame5;

/**
 * @author 林志贤
 * @version 1.0
 * 坦克爆炸效果
 */
public class Bomb {
    int x, y;//炸弹的坐标
    int life = 9;//炸弹的生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
