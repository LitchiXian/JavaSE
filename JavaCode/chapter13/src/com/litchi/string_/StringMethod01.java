package com.litchi.string_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals 前面讲过了，注意区分大小写
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//false
        //2.equalsIgnoreCase 忽略大小写的判断内容是否相等
        System.out.println(str1.equalsIgnoreCase(str2));//true
        //3.length 获取字符串的个数，字符串的长度
        System.out.println("litchi".length());
        //4.indexOf 获取字符或字符串在字符串对象中的第一次出现的索引，索引从 0 开始，如果找不到，返回 -1
        String s1 = "wer@terwe@g";
        int index = s1.indexOf('@');
        System.out.println(index);
        int index2 = s1.indexOf("we");
        System.out.println(index2);
        //5.lastIndexOf 获取字符或字符串在字符串最后一次出现的索引，索引从0开始，如果找不到，返回 -1
        index = s1.lastIndexOf('@');
        System.out.println(index);
        index2 = s1.lastIndexOf("we");
        System.out.println(index2);
        //6.substring 截取指定范围的子串
        String name = "hello,张三";
        System.out.println(name.substring(6));//截取之后的字符
        System.out.println(name.substring(2, 5));//截取指定位置的字符

    }
}
