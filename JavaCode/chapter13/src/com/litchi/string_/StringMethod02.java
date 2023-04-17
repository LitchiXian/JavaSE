package com.litchi.string_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringMethod02 {
    public static void main(String[] args) {
        //1.toUpperCase 转换成大写
        String s = "heLLo";
        System.out.println(s.toUpperCase());
        //2.toLowerCase
        System.out.println(s.toLowerCase());
        //3.concat 拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);
        //4.replace 替换字符串中的字符或字符串
        //s1.replace() 方法执行后，返回的结果才是替换过的，
        //注意 对 s1 没有任何影响，所以要接收一下
        s1 = s1.replace("林黛玉", "jack");
        System.out.println(s1);
        //5.split 分割字符串,对于某些分割字符，我们需要 转义比如 | \\ 等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] split = poem.split(",");
        for (String s2 : split) {
            System.out.println(s2);
        }
        poem = "E:\\aaa\\bbb";
        String[] split2 = poem.split("\\\\");
        for (String s2 : split2) {
            System.out.println(s2);
        }
        //6.toCharArray 转成字符数组
        String s2 = "happy";
        char[] chs = s2.toCharArray();
        for (char ch : chs) {
            System.out.print(ch + "\t");
        }
        System.out.println();
        //7.compareTo 比较两个字符串的大小，如果前者大
        // 则返回正数，后者大，则返回负数，如果相等，返回0
        String a = "jackabc";
        String b = "jdhh";
        System.out.println(a.compareTo(b));
        //8.format
        String name = "john";
        int age = 10;
        double score = 98.3 / 3;
        char gender = '男';
        //将所有的信息都拼接在一个字符串。
        String info = "我的姓名是" + name + ";年龄是" + age + "; 成绩是" + score + ";性别是" + gender;
        System.out.println(info);
        //1.%s, %d, %.2f, %c 称为占位符
        //2.这些占位符由后面的变量来替换
        //3.%s 表示后面由 字符串来替换
        //4.%d 表示.........
        //5.格式不对会报错
        String formatStr = "我的姓名是%s，年龄是%d，成绩是%.2f，性别是%c";
        String info2 = String.format(formatStr, name, age, score, gender);
        System.out.println(info2);
    }
}
