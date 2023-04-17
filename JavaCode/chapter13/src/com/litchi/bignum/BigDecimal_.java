package com.litchi.bignum;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author 林志贤
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //当我们需要保持一个精度很高的数时，double 不够用
        //可以选择 BigDecimal
//        double d = 1999.222222222229999999999999999999999d;
//        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("1999.22222222222999999999999");
        System.out.println(bigDecimal);
        //1.如果对 BigDecimal 进行运算，比如加减乘除，需要使用对应的方法
        //2.可以创建一个 要操作的 BigDecimal 然后进行相应操作
        BigDecimal bigDecimal1 = new BigDecimal("1999.2222222222299999999999");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);//加法
        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);//减法
        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println(multiply);//乘
//        BigDecimal divide = bigDecimal1.divide(bigDecimal2);//可能抛出异常ArithmeticException无限循环小数
        //在调用 divide 方法时，指定精度即可
        //如果有无限循环小数，就会保留 分子 的精度
        BigDecimal divide = bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_CEILING);
        System.out.println(divide);//除
    }
}
