package com.litchi.transformation;

import java.io.*;

/**
 * @author 林志贤
 * @version 1.0
 * 演示使用 OutputStreamWriter
 * 把 FileOutputStream 字节流，转成 字符流 OutputStreamWriter
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\workspace\\a.txt";
//        String filePath = "d:\\workspace\\txt.txt";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), "gbk"));
        bw.newLine();
        bw.write("你好");
        bw.newLine();
        bw.write("hello, i am bw(come on, come on, come on, hahahah )");
        bw.newLine();
        bw.close();
    }
}
