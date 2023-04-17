package com.litchi.transformation;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CodeQuestion {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\workspace\\a.txt";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String readLen = "";
        while ((readLen = br.readLine()) != null){
            System.out.println(readLen);
        }

        br.close();
    }
}
