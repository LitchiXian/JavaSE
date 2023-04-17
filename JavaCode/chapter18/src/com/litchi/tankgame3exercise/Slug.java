package com.litchi.tankgame3exercise;

import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Slug {
    private int x;
    private int y;
    private int direct;
    private int speed;

    private final int BORDER_UP = 0;
    private final int BORDER_DOWN = 750;
    private final int BORDER_LEFT = 0;
    private final int BORDER_RIGHT = 1000;

    public Slug(int x, int y, int direct) {

        this.direct = direct;
        switch (direct) {
            case 0:
                this.x = x + 20;
                this.y = y;
                break;
            case 1:
                this.x = x + 60;
                this.y = y + 20;
                break;
            case 2:
                this.x = x + 20;
                this.y = y + 60;
                break;
            case 3:
                this.x = x;
                this.y = y + 20;
                break;
        }

        this.speed = 5;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveSlug() {
        switch (direct) {
            case 0:
                y -= speed;
                break;
            case 1:
                x += speed;
                break;
            case 2:
                y += speed;
                break;
            case 3:
                x -= speed;
                break;
        }
    }

    public boolean judgeBoundary() {
        return !(x > BORDER_LEFT && x < BORDER_RIGHT && y > BORDER_UP && y < BORDER_DOWN);
    }

    public int judgeHitEnemyTanks(Vector<EnemyTank> enemyTanks){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

        }
        return -1;
    }
}
