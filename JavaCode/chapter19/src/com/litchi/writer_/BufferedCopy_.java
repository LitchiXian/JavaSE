package com.litchi.writer_;

import java.io.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) {


        //说明强调
        // 1.BufferedReader 和 BufferedWriter 是按照字符操作【文本文件】
        // 2.不要去操作二进制文件[图片、音频、视频等等]，可能造成损坏


        String srcFilePath = "d:\\workspace\\a.txt";
        String destFilePath = "d:\\workspace\\b\\a1.txt";

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

            //说明 ： readLen 读取一行的内容，但是没有换行
            String readLen = "";
            while ((readLen = bufferedReader.readLine()) != null) {
                bufferedWriter.write(readLen);
                bufferedWriter.newLine();
            }
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
