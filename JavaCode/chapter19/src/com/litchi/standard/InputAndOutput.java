package com.litchi.standard;

import java.util.Scanner;

/**
 * @author 林志贤
 * @version 1.0
 */
public class InputAndOutput {
    public static void main(String[] args) {
        //System 类的 public final static InputStream in = null;
        //System.in 编译类型 InputStream
        //System.in 运行类型 BufferedInputStream
        // 表示的是标准输入 键盘
        System.out.println(System.in.getClass());

        //System 类的 public final static PrintStream out = null;
        //System.out 编译类型 PrintStream
        //System.out 运行类型 PrintStream
        // 表示标准输出 显示器
        System.out.println(System.out.getClass());


        System.out.println("hello，lithci");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        System.out.println(next);
    }
}
