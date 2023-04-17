package com.litchi.stringbuffer_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        //1.创建一个 大小为 16的 char[], 用于存放字符内容
        StringBuffer stringBuffer1 = new StringBuffer();
        //2.通过构造器，指定char[] 大小
        StringBuffer stringBuffer2 = new StringBuffer(100);
        //3.通过给一个 String 创建StringBuffer，char[] 大小为 String.length + 16
        StringBuffer hello = new StringBuffer("Hello");

    }
}
