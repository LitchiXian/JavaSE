package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
//        System.out.println(Frock.getNextNum());
//        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.toString());
        System.out.println(frock2.toString());
        System.out.println(frock3.toString());
    }
}

class Frock {
    private static int currentNum = 100000;//出场的序列号初始值
    private int serialNumber;

    public static int getNextNum() {
        return currentNum += 100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}