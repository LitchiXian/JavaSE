package com.litchi.back_up.tankgame5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 * 坦克大战的绘图区域
 */
//为了监听 键盘事件， 实现 KeyListener
//为了让 Panel 不停的重回子弹，需要将MyPanel 实现 Runnable，当作一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero;
    //定义敌人坦克，放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //说明，当子弹击中坦克时，加入一个 Bomb 对象到 bombs
    //定义一个Vector，用于存放炸弹
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSeize = 3;

    //定义三张炸弹图片，用于显示爆炸效果
    Image image1;
    Image image2;
    Image image3;

    public MyPanel() {
        hero = new Hero(250, 200);//初始化坦克
        hero.setSpeed(5);

        //初始化敌人坦克
        for (int i = 0; i < enemyTankSeize; i++) {
            //创建敌人的坦克，并加入集合
            EnemyTank enemyTank = new EnemyTank(((1 + i) * 100), 0);
            Thread thread = new Thread(enemyTank);
            thread.setDaemon(true);
            thread.start();
            //给敌人坦克初始化子弹
            Shot shot = new Shot(enemyTank.getX(), enemyTank.getY(), enemyTank.getDirect());
            enemyTank.shots.add(shot);
            //启动线程
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色

        //画出自己坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);

//        //画出hero射击的坦克
//        if (hero.shot != null && hero.shot.isLive) {
//            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//        }
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive)
                g.draw3DRect(shot.x, shot.y, 1, 1, false);
            else {
                hero.shots.remove(shot);
//                hero.shotNum++;
            }
        }


        //如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb 对象的life 去画出对应的图片
            switch (bomb.life) {
                case 9:
                case 8:
                case 7:
                    g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
                    break;
                case 6:
                case 5:
                case 4:
                    g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
                    break;
                case 3:
                case 2:
                case 1:
                    g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
                    break;
            }
            //让子弹生命减少
            bomb.lifeDown();
            //如果子弹生命为 0，就从 bombs 集合中移除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //画出敌人的坦克，遍历 Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            if (!enemyTank.isLive) {
                continue;
            }
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
            //画出敌人坦克子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 1, 1, false);
                } else {
                    enemyTank.shots.remove(j);
                }

            }
        }
    }

    //编写方法，画出坦克

    /**
     * @param x      坦克的左上角 x 坐标
     * @param y      坦克的左上角 y 坐标
     * @param g      画笔
     * @param direct 坦克方向(上下左右)
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型的坦克，设置不同颜色
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            case 1: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 3: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //如果我们的坦克可以发射多个子弹
    //在判断我方子弹是否击中敌人时，就需要把我们的子弹集合中
    //所有的子弹，都取出来和敌人的坦克进行判断
    public void hitEnemyTank(){
        //遍历我们的子弹
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            //判断是否击中敌人坦克
            if (shot.isLive) {//当我子弹还存活
                //遍历敌人所有坦克
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(hero.shot, enemyTank);
                }
            }
        }
    }

    //编写方法，判断我方坦克子弹是否集中敌方坦克
    public void hitTank(Shot s, EnemyTank enemyTank) {
        //判读s 击中坦克
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //将敌人坦克移除 Vector
                    enemyTanks.remove(enemyTank);
                    //创建 Bomb，加入到bomb集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }

                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //将敌人坦克移除 Vector
                    enemyTanks.remove(enemyTank);
                    //创建 Bomb，加入到bomb集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    //处理 wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                hero.setDirect(0);
                hero.moveUp();
                break;
            case KeyEvent.VK_S:
                hero.setDirect(2);
                hero.moveDown();
                break;
            case KeyEvent.VK_A:
                hero.setDirect(3);
                hero.moveLeft();
                break;
            case KeyEvent.VK_D:
                hero.setDirect(1);
                hero.moveRight();
                break;
            case KeyEvent.VK_J:
                //发射一颗子弹
//                if (hero.shot == null || !hero.shot.isLive)
                //发射多颗子弹
                hero.shotEnemyTank();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hitEnemyTank();

            this.repaint();
        }
    }
}
