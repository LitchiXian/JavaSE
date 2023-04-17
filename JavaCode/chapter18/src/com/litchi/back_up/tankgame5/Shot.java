package com.litchi.back_up.tankgame5;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Shot implements Runnable {
    int x;
    int y;
    int direct;
    int speed = 3;
    boolean isLive = true;

    private final int BORDER_UP = 0;
    private final int BORDER_DOWN = 750;
    private final int BORDER_LEFT = 0;
    private final int BORDER_RIGHT = 1000;

    public Shot(int x, int y, int direct) {
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
        this.direct = direct;
    }

    @Override
    public void run() {//射击
        while (true) {
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
            if (!(x > BORDER_LEFT && x < BORDER_RIGHT && y > BORDER_UP && y < BORDER_DOWN && isLive)) {
                isLive = false;
                break;
            }
        }
    }

    public boolean judgeBoundary() {
        return !(x > BORDER_LEFT && x < BORDER_RIGHT && y > BORDER_UP && y < BORDER_DOWN);
    }
}
