package com.litchi.exception_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "litchi";
        int num = 0;//NumberFormatException
        try {
            num = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        System.out.println(num);
    }
}
