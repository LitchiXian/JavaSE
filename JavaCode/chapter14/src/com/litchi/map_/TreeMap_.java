package com.litchi.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class TreeMap_ {
    public static void main(String[] args) {
        //使用默认的构造器，创建 TreeMap ，是无序的(没有排序)
//        TreeMap treeMap = new TreeMap();
        //要求，按照传入的 k(String) 的大小进行排序
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                if (s1.length() == s2.length())
                    return s1.compareTo(s2);
                return s1.length() - s2.length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("krestina", "克瑞斯提诺");
        treeMap.put("smith", "史密斯");

        System.out.println("treeMap=" + treeMap);

        //解读
        /*
        1.构造器。把传入的实现了 Comparator 接口的匿名内部类(对象), 传给 TreeMap 的 comparator
            public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
        2.调用 put 方法
        2.1 第一次添加，把 k-v 封装到 Entry 对象，放入 root
            Entry<K,V> t = root;
            if (t == null) {
                compare(key, key); // type (and possibly null) check

                root = new Entry<>(key, value, null);
                size = 1;
                modCount++;
                return null;
            }
        2.2 以后添加
            Comparator<? super K> cpr = comparator;
            if (cpr != null) {
                do {//遍历所有的key，给当前 key 找到适当位置
                    parent = t;
                    //动态绑定到我们的匿名内部类compare
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else //如果遍历过程中，发现准备添加 key 和当前已有的 key相等，就不添加
                        return t.setValue(value);
                } while (t != null);
            }
         */
    }
}
