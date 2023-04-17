package com.litchi.stringbuffer_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //1.StringBuffer 的直接父类 是 AbstractStringBuilder
        //2.StringBuffer 实现了 Serializable，即StringBuffer对象可串行化
        //3.在父类中 AbstractStringBuilder 有属性 char[] value, 不是final
        // 该value 数组存在 字符串内容, 引用存放在堆中
        //4.StringBuffer 是一个 final类，不能被继承
        //5.StringBuffer保存的是字符串变量,里面的值可以更改，每次StringBuffer的更新实际上可以更新内容，
        // 不用每次更新地址(即不是每次创建新对象)，效率较高
        StringBuffer s = new StringBuffer();
    }
}
