package com.litchi.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        //1. add:添加单个元素
        list.add("jack");
        list.add(100);//list.add(new Integer(100));
        list.add(true);//存的是对象
        System.out.println("list=" + list);
        //2. remove:删除指定元素
//        list.remove(0);//删除第一个元素
        list.remove(true);//指定删除某个元素
        System.out.println("list=" + list);
        //3. contains:查找元素是否存在
        System.out.println(list.contains("jack"));
        //4. size:获取元素个数
        System.out.println(list.size());
        //5. isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        //6. clear:清空
        list.clear();
        System.out.println("list=" + list);
        //7. addAll:添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        arrayList.add("Java从入门到入土");
        list.addAll(arrayList);
        list.add("了再");
        System.out.println("list=" + list);
        //8. containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        //9. removeAll：删除多个元素
        list.removeAll(arrayList);
        System.out.println("list=" + list);
    }
}
