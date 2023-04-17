package com.litchi.homework;

import java.io.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\workspace\\a.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        String readLen = "";
        while ((readLen = br.readLine()) != null){
            readLen = readLen + '.';
            System.out.println(readLen);
        }
        br.close();
    }
}
