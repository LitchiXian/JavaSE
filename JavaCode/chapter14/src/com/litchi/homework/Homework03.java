package com.litchi.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        //将 jack 的工资更改为 2600
        m.put("jack", 200);
        System.out.println("m=" + m);
        //两种修改方式
        m.replace("jack", 2600);
        System.out.println("m=" + m);
        //为所有员工工资加薪100
//        Collection values = m.values();
//        for (Object value : values) {
//            Integer i = (Integer) value;
//            i += 100;
//        }
//        Set entrySet = m.entrySet();
        //哇，我是没想到
        Set keySet = m.keySet();
        for (Object key : keySet) {
            m.put(key, (Integer) m.get(key) + 100);
        }

        System.out.println("m=" + m);
        //遍历集合中所有员工
//        Set keySet = m.keySet();
        for (Object o : keySet) {
            System.out.println(o);
        }
        //遍历所有员工工资
        Collection values = m.values();
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
