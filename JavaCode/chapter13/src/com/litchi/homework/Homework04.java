package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String name = "FGIUK33Jkjd234soikJ234";
        judge(name);
    }


    public static void judge(String a){
        if (a == null){
            System.out.println("请输入非空字符串");
            return;
        }
        char[] chars = a.toCharArray();
        int UP = 0;
        int LOW = 0;
        int DIGIT = 0;

        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                UP++;
            } else if (Character.isLowerCase(aChar)) {
                LOW++;
            } else if (Character.isDigit(aChar)){
                DIGIT++;
            }
        }
        System.out.println("大写字母有 " + UP + "个，小写字母有 " + LOW + "个，数字有 " + DIGIT + "个");
    }
}
