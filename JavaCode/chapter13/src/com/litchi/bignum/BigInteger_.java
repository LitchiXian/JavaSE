package com.litchi.bignum;

import java.math.BigInteger;

/**
 * @author 林志贤
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        //当我们编程中，需要处理很大的整数，long 不够用
        //可以使用BigInteger类来搞定
//        long l = 23999966666666699999l;
//        System.out.println("l = " + l);
        BigInteger bigInteger1 = new BigInteger("239999666666666999993333");
        BigInteger bigInteger2 = new BigInteger("104798273498723984720");
        System.out.println(bigInteger1);
        //1.在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接使用 + - * /
        //2.可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println(add);//加法
        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        System.out.println(subtract);//减法
        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger1.divide(bigInteger2);
        System.out.println(divide);//除
    }
}
