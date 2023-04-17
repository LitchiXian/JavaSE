package com.litchi.junit_;

import org.junit.jupiter.api.Test;

/**
 * @author 林志贤
 * @version 1.0
 */
public class JUnit_ {
    public static void main(String[] args) {
        //传统方式
//        new JUnit_().m1();
//        //还得来回切换，注销//麻烦
//        new JUnit_().m2();
    }

    @Test
    public void m1(){
        System.out.println("m1方法被调用");
    }

    @Test
    public void m2(){
        System.out.println("m2方法被调用");
    }
}
