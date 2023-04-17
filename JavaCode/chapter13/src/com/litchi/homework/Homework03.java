package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        //思路分析
        //1.首先通过空格区分开来每个区域
        //2.3 -> 1, 1- > 2 , 2 -> .2
        //走代码
        String name = "Han Shun Ping";

//        int n1 = name.indexOf(' ');
//        int n2 = name.lastIndexOf(' ');
//        String name1 = name.substring(0, n1);
//        String name2 = name.substring(n1 + 1, n1 + 2);
//        String name3 = name.substring(n2 + 1);
//
//        StringBuilder stringBuilder = new StringBuilder(name3+"," + name1 + "." + name2);
//        System.out.println(stringBuilder);

        if (name == null){
            System.out.println("str 不能为空");
            return;
        }

        String[] s = name.split(" ");
        if (s.length != 3){
            System.out.println("输入格式不正确 XXX XXX XXX");
            return;
        }

        String format = String.format("%s,%s .%c", s[2], s[0], s[1].charAt(0));
        System.out.println(format);
    }
}
