package com.litchi.exception_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //当抛出异常后，程序就退出了，崩溃了，下面的代码就不在执行
        //这样的程序不好，不应该出现了一个不算致命的问题，就导致整个系统崩溃
        //java 设计者提供了一个叫 异常处理机制来解决问题
        int res = 0;
        try {
            res = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("res = " + res);

        System.out.println("程序继续运行...");
    }
}
