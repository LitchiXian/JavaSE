package com.litchi.main_;

public class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数的值为 " + args[i]);
        }
    }
}
