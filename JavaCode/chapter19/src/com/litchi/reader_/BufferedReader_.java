package com.litchi.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author 林志贤
 * @version 1.0
 * 演示 BufferedReader 使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {

        String filePath = "d:\\workspace\\a.txt";
        //创建 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String readLen = "";//按行读取，效率高
        //说明
        // 1.bufferedReader.readLine() 是按行读取文件
        // 2.当返回 null 时，表示文件读取完毕
        while ((readLen = bufferedReader.readLine()) != null){
            System.out.println(readLen);
        }

        //关闭流，这里注意，只需要关闭 BufferedReader， 因为底层会自动的去关闭 节点流
        //FileReader
        bufferedReader.close();
    }


}
