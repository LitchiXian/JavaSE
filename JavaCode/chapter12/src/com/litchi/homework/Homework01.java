package com.litchi.homework;

import java.util.Scanner;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = 0;
//        int n2 = 0;
//        try {
//            System.out.println("请输入第一个数：");
//            String a = sc.next();
//            n1 = Integer.parseInt(a);
//            System.out.println("请输入第二个数：");
//            String b = sc.next();
//            n2 = Integer.parseInt(b);
//            System.out.println(EcmDef.cal(n1, n2));
//        } catch (NumberFormatException e) {
//            System.out.println("请输入正确数字");
//        }
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int res = EcmDef.cal(n1, n2);
            System.out.println("计算结果是 = " + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }
}

class EcmDef {
    public static int cal(int n1, int n2) {
//        int res = 0;
//        try {
//            res = n1 / n2;
//        } catch (Exception e) {
//            System.out.println("不能除0");
//            throw new RuntimeException(e);
//        }
//        return res;
        return n1 / n2;
    }
}
