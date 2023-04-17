package com.litchi.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {
        
    }
    
    public void f1() throws FileNotFoundException {
        //异常处理
        //这里异常是编译异常，必须要明确处理
        //1.try-catch
        //2.throws,抛出异常，让调用f1方法的调用者（方法）处理
        //3.throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
        //4.throws 关键字也可以是 异常列表，即可以抛出多个异常
        FileInputStream fis = new FileInputStream("d:/aa.txt");
    }
}
