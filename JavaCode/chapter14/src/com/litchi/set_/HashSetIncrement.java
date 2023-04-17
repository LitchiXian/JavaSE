package com.litchi.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 林志贤
 * @version 1.0
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        /*
        1. HashSet 底层是 HashMap ,第一次添加时, table 数组扩容到16，临界值( threshold )是16*加载因子(LoadFactor)是0.75 = 12
        2. 如果table 数组使用到了临界值12,就会扩容到16**2=32,新的临界值就是32*0.75 = 24,依次类推
         */

        HashSet hashSet = new HashSet();
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }
        /*
        在Java8中，如果一条链表的元素个数到达 TREEIFY THRESHOLD(默认是8)并且table的大小 >= MIN_TREEIFY_CAPACITY(默认 64 ),就会进行树化(红黑树)，**否则仍然采用数组扩容机制
         */
//        for (int i = 1; i < 12; i++) {
//            hashSet.add(new A(i));
//        }

        /*
            当我们向 hashSet 增加一个元素， -> Node -> 加入table，就算是增加了一个

         */

        for (int i = 1; i < 8; i++) {//在table
            hashSet.add(new A(i));
        }

        for (int i = 1; i < 8; i++) {
            hashSet.add(new B(i));
        }
    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}