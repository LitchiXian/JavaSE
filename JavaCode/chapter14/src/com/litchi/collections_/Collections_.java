package com.litchi.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Collections_ {
    public static void main(String[] args) {
        //创建 ArrayList 集合，用于测试
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("jack");
        list.add("litchi");
        System.out.println("list=" + list);
        //第一组
        //- reverse(List) : 反转 List中元素的顺序
        Collections.reverse(list);
        System.out.println("list=" + list);
        //- shuffle(List) : 对 List集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println("list=" + list);
        Collections.shuffle(list);
        System.out.println("list=" + list);
        //- sort(List) : 根据元素的自然顺序对指定 List 集合元素按升序排序
        Collections.sort(list);
        System.out.println("自然排序后");
        System.out.println("list=" + list);
        //- sort(List, Comparator) : 根据指定的 Comparator产生的顺序对 List集合元素进行排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //TODO 加入校验代码 校验是否为 指定类型 如（String）
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("指定排序后");
        System.out.println("list=" + list);
        //- swap(List, int, int) : 将指定list集合中的i处元素和j处元素进行交换
        Collections.swap(list, 0, 4);
        System.out.println("list=" + list);

        //第二组
        // - Object max(Collection) : 根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然顺序最大元素=" + Collections.max(list));
        //- Object max(Collection, Comparator) : 根据Comparator 指定的顺序,返回给定集合中的最大元素
        //比如，我们要返回字符串长度最大的
        System.out.println("字符串长度最大元素=" + Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        //- Object min(Collection)
        //- Object min(Collection, Comparator)
        //这两个跟上面的差不多，自己去试试
        //- int frequency(Collection, Object) : 返回指定集合中指定元素的出现次数
        System.out.println("tom出现次数=" + Collections.frequency(list, "tom"));
        list.add("tom");
        list.add("tom");
        System.out.println("tom出现次数=" + Collections.frequency(list, "tom"));
        //- void copy(List dest.List src) : 将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝，我们需要先给 dest 赋值，大小和 list.size() 一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //拷贝
        Collections.copy(dest, list);
        System.out.println("dest=" + dest);
        //- boolean replaceAll(List list, Object oldVal, Object newVal) : 使用新值替换List 对象的所有旧值
        Collections.replaceAll(list, "tom", "荔枝");
        System.out.println("list=" + list);

    }
}
