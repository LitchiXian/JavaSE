package com.litchi.stringbuffer_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //增
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);
        //删
        /*
        删除索引 >= start && <= end 处的字符
         */
        s.delete(12, 16);
        System.out.println(s);
        //改
        s.replace(9, 11, "艾尔文");
        System.out.println(s);
        //查
        int indexOf = s.indexOf("尔文");
        System.out.println(indexOf);
        //插
        s.insert(9,"赵敏");
        System.out.println(s);
        //输出长度
        System.out.println(s.length());
        System.out.println(s);
    }
}
