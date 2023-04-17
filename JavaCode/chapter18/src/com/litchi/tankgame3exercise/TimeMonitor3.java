package com.litchi.tankgame3exercise;

import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TimeMonitor3 extends Thread {
    private Vector<EnemyTank> enemyTanks;
    private Vector<Slug> enemySlugs;
    int enemyTankSeize = 3;

    public TimeMonitor3(Vector<EnemyTank> enemyTanks, Vector<Slug> enemySlugs){
        this.enemyTanks = enemyTanks;
        this.enemySlugs = enemySlugs;

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int i = (int) (Math.random() * 100 + 1);
            if (i>=80){
                continue;
            }
            for (int j = 0; j < enemyTankSeize; j++) {
                EnemyTank enemyTank = enemyTanks.get(j);
                enemySlugs.add(new Slug(enemyTank.getX(), enemyTank.getY(), enemyTank.getDirect()));
            }
        }
    }
}
