package com.litchi.stringbuilder;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        //1.StringBuilder 继承 AbstractStringBuilder类
        //2.StringBuilder 实现了 Serializable，说明StringBuilder对象可以串行化【可网路传输，也可保存于文件中】
        //3.StringBuilder 是final类，不能被继承
        //4.StringBuilder 对象字符序列仍然存放在其父类 AbstractStringBuilder 的 char[] value;
        //  因此，字符序列是堆中
        //5.StringBuilder 的方法，没有做synchronized(互斥的处理)关键字，
        // 因此在单线程的情况下使用 StringBuilder
        StringBuilder sb = new StringBuilder();
    }
}
