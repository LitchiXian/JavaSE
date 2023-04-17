package com.litchi.writer_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 BufferedWriter 使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\workspace\\a.txt";
        //创建 BufferedReader 对象
        //说明
        // 1.new FileWriter(filePath) 覆盖模式
        // 2.new FileWriter(filePath,true) 追加模式
        // 3.没有文本也会自己创建
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        //插入一个换行
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello, 老荔枝!");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("come on,come on, come on!!!!");
        //关闭流，这里注意，只需要关闭 BufferedWriter， 因为底层会自动的去关闭 节点流
        //FileWriter
        bufferedWriter.close();

    }
}
