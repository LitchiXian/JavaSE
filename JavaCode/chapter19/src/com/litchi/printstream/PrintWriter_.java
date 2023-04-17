package com.litchi.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 PrintWriter 使用
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\workspace\\txt.txt";

        PrintWriter pw = new PrintWriter(new FileWriter(filePath, true));
        pw.print("hi,北京你好~~~");
        pw.close();
    }
}
