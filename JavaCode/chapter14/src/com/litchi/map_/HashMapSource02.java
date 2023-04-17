package com.litchi.map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author 林志贤
 * @version 1.0
 */
public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 1; i < 12; i++) {
            map.put(new A(i), "hello");
        }

        System.out.println("map=" +map);

        //布置一个任务，自己设计代码去验证，table的扩容
        //增强自己设计程序，验证 -> 增强自己阅读源码能力. 看别人的代码
    }
}

class A{
    private int n;

    public A(int n) {
        this.n = n;
    }


    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "n=" + n +
                '}';
    }
}