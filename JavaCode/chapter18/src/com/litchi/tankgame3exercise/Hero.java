package com.litchi.tankgame3exercise;

import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank {
    private Vector<Slug> slugs;

    public Hero(int x, int y, Vector<Slug> slugs) {
        super(x, y);
        this.slugs = slugs;
    }

    public Vector<Slug> getSlugs() {
        return slugs;
    }

    public void setSlugs(Vector<Slug> slugs) {
        this.slugs = slugs;
    }
}
