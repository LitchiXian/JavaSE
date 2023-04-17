package com.litchi.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class LinkedListUser {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);
        //演示一个删除结点的
//        linkedList.remove(); // 这里默认删除的是第一个结点
//        linkedList.remove(1);
        System.out.println("linkedList=" + linkedList);
        //修改某个结点对象
        linkedList.set(1, 999);
        System.out.println("linkedList=" + linkedList);
        //得到某个结点对象
        //get(1) 是得到双向链表的第二个对象
        Object o = linkedList.get(1);
        System.out.println(o);//999
        //因为 LinkedList 是 实现了 List 接口, 遍历方式
        System.out.println("===LinkeList 遍历迭代器====");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }
        System.out.println("===LinkeList 遍历增强 for====");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("===LinkeList 遍历普通 for====");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //老韩源码阅读.
         /* 1. LinkedList linkedList = new LinkedList();
               public LinkedList() {}
            2. 这时 linkeList 的属性 first = null last = null
            3. 执行 添加
                public boolean add(E e) {
                    linkLast(e);
                    return true;
                }
            4.将新的结点，加入到双向链表的最后
                void linkLast(E e) {
                    final Node<E> l = last;
                    final Node<E> newNode = new Node<>(l, e, null);
                    last = newNode;
                    if (l == null)
                        first = newNode;
                    else
                        l.next = newNode;
                    size++;
                    modCount++;
                }
            */
    }
}
