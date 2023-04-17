package com.litchi.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class MapMethod {
    public static void main(String[] args) {
        //演示 Map 接口常用方法
        Map map = new HashMap();
        //- put：添加
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");//替换v
        map.put("王宝强", "马蓉");//OK
        map.put("宋茜", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK
        System.out.println("map=" + map);
        //- remove：根据键删除映射关系
        map.remove(null);
        System.out.println("map=" + map);
        //- get：根据键获取值
        Object v = map.get("鹿晗");
        System.out.println(v);
        //- size：获取元素个数
        System.out.println("k-v = " + map.size());
        //- isEmpty：判断个数是否为 0
        System.out.println(map.isEmpty());
        //- clear：清除 k-v
//        map.clear();//谨慎使用
        System.out.println("map=" + map);
        //- containsKey：查找键是否存在
        boolean b = map.containsKey("邓超");
        System.out.println(b);
    }
}

class Book{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}