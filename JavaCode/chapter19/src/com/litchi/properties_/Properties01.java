package com.litchi.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\mysql.properties";

        //读取 mysql.properties 文件，并得到 ip，user，和 pwd
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String readLen = "";
        while ((readLen = br.readLine()) != null){
            String[] split = readLen.split("=");
            System.out.println(split[0] + "的值为：" + split[1]);
        }
        br.close();
    }
}
