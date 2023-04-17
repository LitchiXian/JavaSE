package com.litchi.tankgame3exercise;

import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TimeMonitor2 extends Thread{
    private Vector<Slug> heroSlugs;
    private Vector<Slug> enemySlugs;

    public TimeMonitor2(Vector<Slug> heroSlugs, Vector<Slug> enemySlugs){
        this.heroSlugs = heroSlugs;
        this.enemySlugs = enemySlugs;
    }

    @Override
    public void run() {
        while (true){
            for (int i = 0; i < heroSlugs.size(); i++) {
                Slug slug = heroSlugs.get(i);
                slug.moveSlug();
                if (slug.judgeBoundary())
                    heroSlugs.remove(i);
            }
            for (int i = 0; i < enemySlugs.size(); i++) {
                Slug slug = enemySlugs.get(i);
                slug.moveSlug();
                if (slug.judgeBoundary())
                    enemySlugs.remove(i);
            }
            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
