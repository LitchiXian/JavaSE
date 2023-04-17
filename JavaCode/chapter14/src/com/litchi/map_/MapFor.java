package com.litchi.map_;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋茜", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //第一组：先取出 所有的 key，通过key 取出对应的 value
        Set keySet = map.keySet();
        //(1)增强for
        System.out.println("------第一种方式------");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2)迭代器
        System.out.println("------第二种方式------");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的values取出
        Collection values = map.values();
        //这里可以使用多有的 Collection 使用的遍历方法
        //(1)增强for
        System.out.println("------取出所有的value 增强for------");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("------取出所有的value 迭代器------");
        iterator = values.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
        }

        //第三组：通过 EntrySet 来获取 k-v
        Set entrySet = map.entrySet();
        //(1)增强for
        System.out.println("--------使用EntrySet的增强for---------");
        for (Object obj : entrySet) {
            //将 obj 转成 Map.Entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        //(2)迭代器
        iterator = entrySet.iterator();
        System.out.println("--------使用EntrySet的迭代器---------");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }


    }
}
