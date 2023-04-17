package com.litchi.list_;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ListFor {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("tom");
        list.add("jack");
        list.add("litchi");

        System.out.println("使用迭代器");
        //使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println("obj = " + o);
        }
        System.out.println("使用增强for");
        //使用增强for
        for (Object o : list) {
            System.out.println("obj = " + o);
        }
        System.out.println("使用普通for");
        //使用普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println("obj = " + list.get(i));
        }
    }
}
