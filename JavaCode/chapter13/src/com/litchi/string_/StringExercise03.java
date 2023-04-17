package com.litchi.string_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringExercise03 {
//    String str = new String("hsp");
    String str = "hsp";
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        StringExercise03 ex = new StringExercise03();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}
