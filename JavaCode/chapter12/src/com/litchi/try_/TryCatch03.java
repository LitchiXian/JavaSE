package com.litchi.try_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TryCatch03 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        } finally {
            System.out.println("执行了final....");
        }
        System.out.println("程序继续.....");
    }
}
