package com.litchi.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\mytemp";
        File file = new File(filePath);
        if (!file.exists()) {
            if (file.mkdir())
                System.out.println("create " + file.getName() + " success");
            else
                System.out.println("oh! sorry, create " + file.getName() + "is false");
        }else {
            System.out.println("该文件夹已经存在");
        }
        file = new File(filePath, "hello.txt");
        if (!file.exists()) {
            if (file.createNewFile())
                System.out.println("create" + file.getName() + " success");
            else
                System.out.println("oh! sorry, create " + file.getName() + "is false");
        }else {
            System.out.println("该文件已存在");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(filePath + "\\hello.txt");
        fileOutputStream.write("hello,world~~~".getBytes());
        System.out.println("success");
        fileOutputStream.close();
    }
}
