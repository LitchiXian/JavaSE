package com.litchi.string_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        //1.先创建一个 StringBuilder()
        //2.执行 sb.append("hello")
        //3.执行 sb.append("abc")
        //4.String c = sb.toString()
        //最后其实 c 指向堆中的对象（String）value[] -> 池中"helloabc"
        String c = a + b;//变量相加地址在堆中//自己下断点看看
        String d = "helloabc";//常量相加地址在常量池中
        System.out.println(c == d);//false
    }
}
