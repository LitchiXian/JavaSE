package com.litchi.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Collection_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //解读
        //1.集合主要是两组(单列集合，双列集合)
        //2.Collection 接口有两个重要的子接口 List Set ，他们的实现子类都是单列集合（放的都是单个单个的元素）
        //3.Map 接口的实现子类 是双列集合，存放的 Key-Value
        //4.把梳理的两张图记住
        //    Collection

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("name", "李磊");
        hashMap.put("age", 34);
    }

}
