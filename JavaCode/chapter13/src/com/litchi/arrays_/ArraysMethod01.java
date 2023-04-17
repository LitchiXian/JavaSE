package com.litchi.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1, -1, 7, 0, 89};
        //直接使用 Arrays.toString 方法，显示数组
        System.out.println(Arrays.toString(integers));
        //演示 sort 方法的使用 排序
//        Arrays.sort(integers);//默认排序方法
        //定制排序
        //调用 定制排序 时，传入两个参数 (1)排序的数组
        //  (2)实现了 Comparator 接口的匿名内部类，要求实现 compare 方法
        //  先演示，再解释
        //  这里体现了接口编程的方式。看看源代码，那就明白了
        //1.Arrays.sort(integers, new Comparator()
        //2.最终到 TimSort类的 binarySort 方法
        //3.执行到 binarySort方法的代码，会根据动态绑定机制 c.compare()执行我们传入的
        //  匿名内部类的 compare()
        //      while (left < right) {
        //                int mid = (left + right) >>> 1;
        //                if (c.compare(pivot, a[mid]) < 0)
        //                    right = mid;
        //                else
        //                    left = mid + 1;
        //            }
        //4.    new Comparator() {
        //            @Override
        //            public int compare(Object o1, Object o2) {
        //                Integer i1 = (Integer) o1;
        //                Integer i2 = (Integer) o2;
        //                return i2 - i1;
        ////                return i1 - i2;
        //            }
        //      }
        //5.public int compare(Object o1, Object o2) 返回的值 > 0 还是 < 0
        //  会影响整个排序结果，这就充分体现了 接口编程 + 动态绑定 + 匿名内部类的综合使用
        //  将来的底层框架和源码的使用方式，会非常常见
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
//                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
