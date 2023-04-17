package com.litchi.stringbuffer_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//需要看源码，底层调用的是AbstractStringBuilder 的 appendNull
        System.out.println(sb.length());//4//null
        System.out.println(sb);//null

        StringBuffer sb1 = new StringBuffer(str);//报错nullPoint
        System.out.println(sb1);
    }
}
