package com.litchi.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, -1, 7, 0, 89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //binarySearch 通过二分搜索法进行查找，要求必须排好序
        //1. 使用 binarySearch 二叉查找
        //2. 要求该数组是有序的，如果该数组是无序的，不能使用 binarySearch
        //3. 如果数组不中不存在该元素，就返回 return -(low + 1);  // key not found.它应该存在的位置
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);

        //copyOf 数组元素的复制
        //1. 从 arr 数组中，拷贝 arr.length 个元素到 newArr 数组中
        //2. 如果拷贝的长度 > arr.length 就在新数组中后面 增加 null
        //3. 如果拷贝的长度 < 0 就抛出异常 NegativeArraySizeException
        //4. 该方法的底层使用的是 System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, arr.length + 3);
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素的填充
        // 使用 90 去填充 newArr 数组，可以理解成是替换原理的元素
        Arrays.fill(newArr, 90);
        System.out.println(Arrays.toString(newArr));

        //equals 比较两个数组元素内容是否一致
        Integer[] arr1 = {1, 0, 1, 2};
        Integer[] arr2 = {1, 0, 1, 2};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);

        //asList 将一组值，转换成list
        // 1.asList,会将传入的数据(数组，不定参数)转成一个List集合
        // 2.返回的 asList 编译类型 List(接口)
        // 3.asList 运行类型 java.util.Arrays$ArrayList, 是 Arrays类的
        // 静态内部类 private static class ArrayList<E> extends AbstractList<E>
        //        implements RandomAccess, java.io.Serializable
        List asList = Arrays.asList(1, 3, 2, 19, -1, 90);
        System.out.println(asList);
        System.out.println("asList=" + asList);
        System.out.println("asList的运行类型=" + asList.getClass());
    }
}
