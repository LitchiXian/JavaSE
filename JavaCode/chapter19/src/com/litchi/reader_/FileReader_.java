package com.litchi.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {


    }

    /**
     * 单个字符 读取文件
     */
    @Test
    public void readFile01() {
        String filePath = "d:\\workspace\\a.txt";
        FileReader fileReader = null;
        int data = ' ';
        //1.创建 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 多个字符 读取文件
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\workspace\\a.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        //1.创建 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用 read(buf) 返回的是实际读取到的字符数
            // 如果返回 -1，说明到文件结束
            //按照字符读取，没有乱码问题
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
