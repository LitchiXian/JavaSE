package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        ColorImpl color = new ColorImpl();
        color.show(Color.BLUE);
        color.show(Color.GREEN);
        color.show(Color.YELLOW);
        Color col = Color.RED;

        switch (col){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            //…………………………
            default:
                System.out.println("没有匹配到..");
        }
    }
}

enum Color {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public String toString() {
        return name() + "{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}

interface IColor {
    void show(Color color);
}

class ColorImpl implements IColor {
    @Override
    public void show(Color color) {
        System.out.println(color);
    }
}