package com.litchi.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用 FileOutputStream 将数据写到文件中，
     * 如果该文件不存在，则创建文件
     */
    @Test
    public void writeFile(){
        //创建 FileOutputStream 对象
        String filePath = "d:\\workspace\\b.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream 对象
            //说明
            //1. new FileOutputStream(filePath) 创建方式，当写入内容时，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式，当写入内容时，是追加到文件后面
            fileOutputStream = new FileOutputStream(filePath, true);
            //写入一个字节
            //fileOutputStream.write('H');
            //写入字符串
            String str = "hello,world";
            //str.getBytes() 可以把 字符串 -> 字节数组
            //fileOutputStream.write(str.getBytes());
            /*
            public void write(byte[] b,
                  int off,
                  int len)
           throws IOException从位于偏移量 off的指定字节数组写入 len字节到该文件输出流。
             */
            fileOutputStream.write(str.getBytes(), 2, 6);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
