package com.litchi.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 FileInputStream 的使用
 * （字节输入流 文件 --> 程序）
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节读取 效率较低
     * -> 使用 read(byte[] b)
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\workspace\\news1.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            //数据的下一个字节，如果达到文件的末尾， -1 。
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);//转成char显示
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 使用 read(byte[] b) 读取，提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\workspace\\news1.txt";
        int readLen = 0;
        //字节数组
        byte[] buf = new byte[8];//一次读取 8 个字节
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //数据的下一个字节，如果达到文件的末尾， -1 。
            //如果读取正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {

                System.out.println(new String(buf, 0, readLen));//显示
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
