package com.litchi.tankgame6;

import java.util.Vector;

/**
 * @author 韩顺平
 * @version 1.0
 * 敌人的坦克
 */
@SuppressWarnings({"all"})
public class EnemyTank extends Tank implements Runnable {
    //在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    Vector<EnemyTank> enemyTanks = new Vector<>();

    //这里提供一个方法，可以将 MyPanel的成员 Vector<EnemyTank> enemyTanks = new Vector<>();
    //设置到 EnemyTank 的成员 enemyTanks
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {

            //这里我们判断如果shots size() =0, 创建一颗子弹，放入到
            //shots集合，并启动
            if (isLive && shots.size() < 1) {
                Shot s = null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2: //向下
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3://向左
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                //启动
                new Thread(s).start();

            }


            //根据坦克的方向来继续激动
            switch (getDirect()) {
                case 0:  //向上
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:  //向右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:  //向下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:  //向左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }


            //然后随机的改变坦克方向 0-3
            setDirect((int) (Math.random() * 4));
            //听老韩说，写并发程序，一定要考虑清楚，该线程什么时候结束
            if (!isLive) {
                break; //退出线程.
            }

        }
    }

    //编写方法，判断当前这个敌人坦克，是否和 enemyTanks 中的其他坦克发生重叠或触碰
    public boolean isTouchEnemyTank() {
        if (enemyTanks.size() == 1)
            return false;
        switch (this.getDirect()) {
            case 0:
                return isTouchEnemyTankUp();
            case 1:
                return isTouchEnemyTankRight();
            case 2:
                return isTouchEnemyTankDown();
            case 3:
                return isTouchEnemyTankLeft();
        }
        return false;

    }

    public boolean isTouchEnemyTankUp() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank == this)
                continue;
            switch (enemyTank.getDirect()) {
                case 0:
                case 2:
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 40
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 60)
                        return true;
                    if (this.getX() + 40 >= enemyTank.getX()
                            && this.getX() + 40 <= enemyTank.getX() + 40
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 60)
                        return true;
                    break;
                case 1:
                case 3:
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 60
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 40)
                        return true;
                    if (this.getX() + 40 >= enemyTank.getX()
                            && this.getX() + 40 <= enemyTank.getX() + 60
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 40)
                        return true;
                    break;
            }
        }
        return false;
    }

    public boolean isTouchEnemyTankRight() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank == this)
                continue;
            switch (enemyTank.getDirect()) {
                case 0:
                case 2:
                    if (this.getX() + 60 >= enemyTank.getX()
                            && this.getX() + 60 <= enemyTank.getX() + 40
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 60)
                        return true;
                    if (this.getX() + 60 >= enemyTank.getX()
                            && this.getX() + 60 <= enemyTank.getX() + 40
                            && this.getY() + 40 >= enemyTank.getY()
                            && this.getY() + 40 <= enemyTank.getY() + 60)
                        return true;
                    break;
                case 1:
                case 3:
                    if (this.getX() + 60 >= enemyTank.getX()
                            && this.getX() + 60 <= enemyTank.getX() + 60
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 40)
                        return true;
                    if (this.getX() + 60 >= enemyTank.getX()
                            && this.getX() + 60 <= enemyTank.getX() + 60
                            && this.getY() + 40 >= enemyTank.getY()
                            && this.getY() + 40 <= enemyTank.getY() + 40)
                        return true;
                    break;
            }
        }
        return false;
    }

    public boolean isTouchEnemyTankDown() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank == this)
                continue;
            switch (enemyTank.getDirect()) {
                case 0:
                case 2:
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 40
                            && this.getY() + 60 >= enemyTank.getY()
                            && this.getY() + 60 <= enemyTank.getY() + 60)
                        return true;
                    if (this.getX() + 40 >= enemyTank.getX()
                            && this.getX() + 40 <= enemyTank.getX() + 40
                            && this.getY() + 60 >= enemyTank.getY()
                            && this.getY() + 60 <= enemyTank.getY() + 60)
                        return true;
                    break;
                case 1:
                case 3:
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 60
                            && this.getY() + 60 >= enemyTank.getY()
                            && this.getY() + 60 <= enemyTank.getY() + 40)
                        return true;
                    if (this.getX() + 40 >= enemyTank.getX()
                            && this.getX() + 40 <= enemyTank.getX() + 60
                            && this.getY() + 60 >= enemyTank.getY()
                            && this.getY() + 60 <= enemyTank.getY() + 40)
                        return true;
                    break;
            }
        }
        return false;
    }

    public boolean isTouchEnemyTankLeft() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank == this)
                continue;
            switch (enemyTank.getDirect()) {
                case 0:
                case 2:
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 40
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 60)
                        return true;
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 40
                            && this.getY() + 40 >= enemyTank.getY()
                            && this.getY() + 40 <= enemyTank.getY() + 60)
                        return true;
                    break;
                case 1:
                case 3:
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 60
                            && this.getY() >= enemyTank.getY()
                            && this.getY() <= enemyTank.getY() + 40)
                        return true;
                    if (this.getX() >= enemyTank.getX()
                            && this.getX() <= enemyTank.getX() + 60
                            && this.getY() + 40 >= enemyTank.getY()
                            && this.getY() + 40 <= enemyTank.getY() + 40)
                        return true;
                    break;
            }
        }
        return false;
    }
}
