package com.litchi.list_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node litchi = new Node("litchi");

        //连接三个节点，形成双向链表
        //jack -> tom -> litchi
        jack.next = tom;
        tom.next = litchi;
        //litchi -> tom -> jack
        litchi.pre = tom;
        tom.pre = jack;

        Node first = jack;//让 first 引用指向 jack，就是双向链表的头节点
        Node last = litchi;////让 last 引用指向 litchi，就是双向链表的尾节点

        //演示，从头到尾进行遍历
        System.out.println("===从头到尾进行遍历===");
        while (true){
            if (first == null)
                break;
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }

        System.out.println("===从尾到头进行遍历===");
        while (true){
            if (last == null)
                break;
            //输出 last 信息
            System.out.println(last);
            last = last.pre;
        }

        //演示链表的添加对象/数据，是多么的方便
        //要求，是在 tom ---- litchi 之间，插入一个对象 smith
        Node smith = new Node("smith");
//        smith.pre = tom;
//        smith.next = litchi;
//
//        tom.next = smith;
//        litchi.pre = smith;
        add(tom, litchi, smith);

        //重置遍历
        first = jack;
        System.out.println("===从头到尾进行遍历===");
        while (true){
            if (first == null)
                break;
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }
    }

    public static void add(Node pre, Node next, Node insert){
        insert.pre = pre;
        insert.next = next;

        pre.next = insert;
        next.pre = insert;
    }
}

//定义一个 Node 类，Node 对象 表示双向链表的一个节点
class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个节点
    public Node pre;//指向上一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}