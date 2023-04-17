package com.litchi.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        //在2号位插入一个元素
        list.add(2, "litchi");
        //获得第5个元素
        Object o = list.get(5 - 1);
        System.out.println(o);
        //删除第6个元素
        list.remove(6 - 1);
        //修改第7个元素，相当于替换
        list.set(7 - 1, "修改后的7");
        //使用迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("list=" + next);
        }
    }
}
