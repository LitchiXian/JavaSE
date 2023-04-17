package com.litchi.string_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        //1. String 对象用于保存字符串，也就是一组字符序列
        //2. 字符串常量对象是用双引号括起来的字符序列。例如："你好"、"12.97"、"boy" 等
        //3. 字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节
        //4.String类较常用构造器(其他看手册) 常用的有：
        //- String s1 = new String();
        //- String s2 = new String(String original);
        //- String s3 = new String(char[] a);
        //- String s4 = new String(char[] a, int startIndex, int count);
        //5.String 类实现了接口 Serializable 【String 可以串行化：可以在网路传输】
        //                接口 Comparable 【String 对象可以比较大小】
        //6.String 是final 类，不能被其他的类继承
        //7.String 有属性 private final char value[];用于存放字符串内容
        //8.一定要注意：value 是一个final类型，不可以修改（地址）
        String name = "jack";
        String n1 = name;
        name = "tom";
        String n2 = name;
        String n3 = "jack";
        String n4 = new String("jack");
        String n5 = new String("jack");

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n3.hashCode());
        System.out.println(n4.hashCode());
        System.out.println(n4.intern());
        System.out.println(n3 == n4);//false//n4 地址在堆，n3 地址在常量池
        System.out.println(n3 == n4.intern());//true //n4.intern()返回常量池地址
        System.out.println(n4 == n5);
    }
}
