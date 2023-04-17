package com.litchi.everyday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class List_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        /*
            public ArrayList() {
                this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;//创立存数据的数组
            }
            private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
         */
        arrayList.add(1);
        /*
        1.
            //每次添加判断是否 空间足够，空间足够的话，直接 elementData[size++] = e; 添加元素
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
        2.
            private void ensureCapacityInternal(int minCapacity) {
                ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
            }
        3.是否扩容 空间不够就扩容
            if (minCapacity - elementData.length > 0)
                grow(minCapacity);
        4.扩容机制
            private void grow(int minCapacity) {
                // overflow-conscious code
                int oldCapacity = elementData.length;
                int newCapacity = oldCapacity + (oldCapacity >> 1);//1.5倍扩容
                if (newCapacity - minCapacity < 0)
                    newCapacity = minCapacity;
                if (newCapacity - MAX_ARRAY_SIZE > 0)
                    newCapacity = hugeCapacity(minCapacity);
                // minCapacity is usually close to size, so this is a win:
                elementData = Arrays.copyOf(elementData, newCapacity);//扩容后，拷贝原数据
            }
         */
        arrayList.add("Hello");

        Vector vector = new Vector();//synchronized 线程安全
        /*
            public Vector(int initialCapacity, int capacityIncrement) {
                super();
                if (initialCapacity < 0)
                    throw new IllegalArgumentException("Illegal Capacity: "+
                                                       initialCapacity);
                this.elementData = new Object[initialCapacity];//创立存数据的数组
                this.capacityIncrement = capacityIncrement;
            }
         */
        vector.add(2);
        /*
        1.同样 每次添加判断是否 空间足够，空间足够的话，直接 elementData[size++] = e; 添加元素
            public synchronized boolean add(E e) {
                modCount++;
                ensureCapacityHelper(elementCount + 1);//判断是否 空间足够
                elementData[elementCount++] = e;
                return true;
            }
        2.不够就扩容
            private void ensureCapacityHelper(int minCapacity) {
                // overflow-conscious code
                if (minCapacity - elementData.length > 0)
                    grow(minCapacity);
            }
        3.扩容机制
            private void grow(int minCapacity) {
                // overflow-conscious code
                int oldCapacity = elementData.length;
                int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                                 capacityIncrement : oldCapacity);//两倍扩容
                if (newCapacity - minCapacity < 0)
                    newCapacity = minCapacity;
                if (newCapacity - MAX_ARRAY_SIZE > 0)
                    newCapacity = hugeCapacity(minCapacity);
                elementData = Arrays.copyOf(elementData, newCapacity);
            }
         */
        vector.add("Hello");

        LinkedList linkedList = new LinkedList();//不是数组咯，是链表
        /*
        1.
            //不是数组咯，是链表
            {
                transient int size = 0;
                transient LinkedList.Node<E> first;
                transient LinkedList.Node<E> last;
            }
            public LinkedList() {
            }
        2.
            每个结点有前结点和后结点
            private static class Node<E> {
            E item;
            Node<E> next;
            Node<E> prev;

            Node(Node<E> prev, E element, Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }
         */
        linkedList.add(3);
        /*
        1.
            public boolean add(E e) {
                linkLast(e);
                return true;
            }
        2.
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
        linkedList.add("Hello");
    }
}
