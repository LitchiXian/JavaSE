package com.litchi.set_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层( HashMap 的底层结构)

        //1.创建一个数组，数组的类型是 Node[](有些人，直接把 Node[] 数组称为 表)
        Node[] table = new Node[16];
        System.out.println("table=" + table);

        //2.创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;// 将 jack 结点挂载到 john
        Node rose = new Node("Rose", null);
        jack.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println();

    }
}

class Node {//结点，存储数据，可以指向下一个结点，从而形成链表
    Object item;//存放数据
    Node next;//指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}