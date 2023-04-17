package com.litchi.wrapper;

/**
 * @author 林志贤
 * @version 1.0
 */
public class WrapperExercise01 {
    public static void main(String[] args) {

        Object obj1 = true ? new Integer(1) : new Double(2);//三元运算符是一个整体，一个整体
        //最高的是Double，所以前面的也变成Double类型了
        System.out.println(obj1);
        System.out.println(obj1.getClass());
    }
}
