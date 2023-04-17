package com.litchi.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)
    @Test
    public void create01(){
        String filePath = "d:\\workspace\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //方式2 new File(File parent, String child)
    //根据父目录文件 + 子路径构建
    @Test
    public void create02(){
        File parentFile = new File("d:\\workspace");
        String fileName = "news2.txt";
        //这里的 file 对象，在java程序中，只是一个对象
        //只有执行了 createNewFile 方法，才会真正的，在磁盘创建文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //方式3 new File(String parent, String child)
    //根据父目录 + 子路径构建
    @Test
    public void create03(){
        String parentPath = "d:\\workspace";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
