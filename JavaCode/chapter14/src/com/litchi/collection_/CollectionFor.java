package com.litchi.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 10.1));

        //1.使用增强for，在Collection集合
        //2.增强for，底层仍然是迭代器
        for (Object book : col) {
            System.out.println("book=" + book);
        }

    }
}
