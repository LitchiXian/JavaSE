package com.litchi.homework;

import java.util.Arrays;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        //将字符串中指定部分进行反转。比如 "abcdef"反转为"aedcbf"
        //思路分析
        //1.获取最后一个字符索引，这样就知道头尾，和中间部分
        //2.字符反转，用for
        //走代码
        String a = "abcdefghijklmn";
        System.out.println(a.length());
//        char temp;
//        char[] chars = a.toCharArray();
//        for (int i = 1; i < (chars.length / 2); i++) {
//            temp = chars[i];
//            chars[i] = chars[chars.length - 1 - i];
//            chars[chars.length - 1 - i] = temp;
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char aChar : chars) {
//            stringBuilder.append(aChar);
//        }
//        System.out.println(stringBuilder);
        String reverse = null;
        try {
            reverse = reverse(a, 1, 12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(reverse);
    }

    public static String reverse(String str, int start, int end) {

//        if (str == null || end > str.length() - 1 || start > end || start < 0) {
//            throw new RuntimeException("参数不正确");
//        }
        //写出正确的情况，然后取反即可
        if (!(str != null && start >= 0 && end > start && end < str.length() - 1)){
            throw new RuntimeException("参数不正确");
        }
            char temp;
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char aChar : chars) {
//            stringBuilder.append(aChar);
//        }
//        String s = stringBuilder.toString();
//        return s;
        return new String(chars);
    }
}
