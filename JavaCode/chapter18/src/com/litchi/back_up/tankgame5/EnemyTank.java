package com.litchi.back_up.tankgame5;

import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 * 敌人的坦克
 */
public class EnemyTank extends Tank implements Runnable {

    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            //这里我们判断如果shots size = 0，创建一颗子弹，放入到shots
            if (isLive && shots.size() < 6) {
                Shot shot = new Shot(getX(), getY(), getDirect());
                Thread thread = new Thread(shot);
                thread.setDaemon(true);
                thread.start();
                shots.add(shot);
            }
            //根据坦克的方向来继续移动
            switch (getDirect()) {
                case 0:
                    //让坦克保持一个方向30步
                    for (int i = 0; i < 30; i++) {
                        if (!moveUp())
                            break;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (!moveRight())
                            break;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (!moveDown())
                            break;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (!moveLeft())
                            break;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }
            //休眠50毫秒
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            //随机的改变方向
            setDirect((int) (Math.random() * 4));
            //重点强调，一旦写多线程，一定要考虑该线程什么时候结束
            if (!isLive) {
                break;
            }
        }
    }
}
