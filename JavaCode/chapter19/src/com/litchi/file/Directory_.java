package com.litchi.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //判断 d:\workspace\news1.txt 是否存在，如果存在就删除
    @Test
    public void m1() {
        File file = new File("d:\\workspace\\news1.txt");
        if (file.exists()) {
            System.out.println("哈哈哈，它存在");
            file.delete();
            System.out.println("say by by");
        } else {
            System.out.println("oh, no here");
        }
    }

    //判断 d:\workspace 是否存在，存在就删除，否则提示不存在
    @Test
    public void m2() {
        File file = new File("d:\\workspace");
        if (file.exists()) {
            System.out.println("哈哈哈，它存在");
            if (file.delete()) {
                System.out.println(file + " delete is success");
            } else {
                System.out.println(file + " is no delete");
            }
            System.out.println("say by by");
        } else {
            System.out.println("oh, no here");
        }
    }

    //判断 d:\\workspace\\a\\b\\c 目录是否存在，如果存在，就提示已经存在，否则就创建
    @Test
    public void m3() {
//        String filePath = "d:\\workspace\\a\\b\\c";
        String filePath = "d:\\workspace\\b";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("哈哈哈，它存在");
        } else {

//          ile.createNewFile();//这个是创建文件
//            file.mkdir();//这个是创建一级目录
            System.out.println(file.mkdirs());//这个是创建多级目录
            System.out.println("success create");


        }
    }
}
