package com.litchi.try_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TryCatch01 {
    public static void main(String[] args) {
        try {
            String str = "数字";
//            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("不管是否发生异常都会执行....");
        }
        System.out.println("程序继续...");
    }
}
