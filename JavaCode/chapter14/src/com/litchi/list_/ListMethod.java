package com.litchi.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        //add 在index位置插入ele元素
        list.add("jack");
        list.add("litchi");
        list.add(1, "tom");
        System.out.println("list=" + list);
        //addAll 在index位置开始将eles中的元素添加进来
        List list2 = new ArrayList();
        list2.add("jacklove");
        list2.add("litchidddd");
        list.addAll(2, list2);
        System.out.println("list=" + list);
        //get 获取index位置的元素
        System.out.println(list.get(3));
        //indexOf 返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("jacklove"));
        //lastIndexOf 返回obj在集合中最后一次出现的位置
        System.out.println(list.lastIndexOf("litchi"));
        //remove 移除指定index位置的元素，并返回此元素
        list.remove(2);
        list.add("kskf");
        System.out.println("list=" + list);
        //set 设置指定index位置的元素为ele，相当于替换
        list.set(0, "litchi");
        System.out.println("list=" + list);
        //subList 返回从fromIndex到toIndex位置的子集合
        List list1 = list.subList(1, 3);
        System.out.println("list1=" + list1);
    }
}
