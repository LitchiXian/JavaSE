package com.litchi.try_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TryCatchException04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        try {
            System.out.println("请输入一个数字: ");
            String a = sc.next();
            int num = Integer.parseInt(a);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("请输入正确数字");
            return method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }

//        while (true) {
//            try {
//                System.out.println("请输入一个数字: ");
//                String a = sc.next();
//                int num = Integer.parseInt(a);
//                return num;
//            } catch (NumberFormatException e) {
//                System.out.println("请输入正确数字");
//            }
//        }
    }
}
