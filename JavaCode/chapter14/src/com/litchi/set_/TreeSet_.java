package com.litchi.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class TreeSet_ {
    public static void main(String[] args) {
        //解读
        //1.当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
        //2.我们希望添加的元素，按照字符串大小来排序
        //3.使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
        //  并指定排序规则
        //4.简单看看源码 debug

//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //下面 调用String的 compareTo方法进行字符串大小比较
//                return ((String)o2).compareTo((String)o1);
                //要求按照长度大小排序
//                return ((String)o2).length() - ((String)o1).length();
                //经过那个 abc长度也是3的情况，试图再次修改
                String s1 = (String)o1;
                String s2 = (String)o2;
                if (s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
                //哈哈哈，好像成了
            }
        });
        //添加数据
        treeSet.add("jack");
        treeSet.add("tom");//3
        treeSet.add("litchi");
        treeSet.add("a");
        //加得进去吗
        treeSet.add("abc");//3
        //不可以，因为你按照长度，所以compare得出结果为 0 ，加不进去

        System.out.println("treeSet = " + treeSet);

        //解读
        /*
        1.构造器把传入的比较器对象，赋给了 TreeSet 的底层的 TreeMap 的属性 this.comparator
            public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
        2.在 调用 treeSet.add("tom"), 在底层会执行到
            Comparator<? super K> cpr = comparator;
            if (cpr != null) {//cpr 就是我们的匿名内部类(对象)
                do {
                    parent = t;
                    //动态绑定到我们的匿名内部类(对象)
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else //如果相等，即返回0，这个key就没有加入
                        return t.setValue(value);
                } while (t != null);
            }
         */
    }
}
