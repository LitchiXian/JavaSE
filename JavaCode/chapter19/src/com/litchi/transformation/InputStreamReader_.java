package com.litchi.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author 林志贤
 * @version 1.0
 * 演示使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成字符流 InputStreamReader，指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\workspace\\a.txt";

        //解读
        // 1.FileInputStream 转成 InputStreamReader
        // 2.指定编码 bgk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        // 3.把 InputStreamReader 传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);
        //将 2 和 3 合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        // 4.读取
        String readLen = "";
        while ((readLen = br.readLine()) != null) {
            System.out.println(readLen);
        }

        //关闭流
        br.close();

    }
}
