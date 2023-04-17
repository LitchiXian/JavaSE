package com.litchi.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Homework02 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 300000);
        Car car2 = new Car("宾利", 250000);
        ArrayList arrayList = new ArrayList();
        //add   添加单个元素
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println("arrayList=" + arrayList);
        //remove    删除指定元素
        arrayList.remove(car1);
        System.out.println("arrayList=" + arrayList);
        arrayList.add(car1);
        System.out.println("arrayList=" + arrayList);
        //contains  查找元素是否存在
        System.out.println(arrayList.contains(car1));
        //size  获取元素个数
        System.out.println(arrayList.size());
        //isEmpty   判断是否为空
        System.out.println(arrayList.isEmpty());
        //clear 清空
        arrayList.clear();
        System.out.println("arrayList=" + arrayList);
        //addAll    添加多个元
        ArrayList l = new ArrayList();
        l.add(car1);
        l.add(car2);
        arrayList.addAll(l);
        System.out.println("arrayList=" + arrayList);
        //containsAll   查找多个元素是否都存在
        System.out.println(arrayList.containsAll(l));
        //removeAll 删除多个元
        arrayList.removeAll(l);
        System.out.println("arrayList=" + arrayList);

        arrayList.addAll(l);
        //使用增强for 遍历
        for (Object o : arrayList) {
            System.out.println(o);
        }
        //使用迭代器 遍历
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class Car {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}