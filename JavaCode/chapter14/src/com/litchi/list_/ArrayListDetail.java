package com.litchi.list_;

import java.util.ArrayList;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("books");
        arrayList.add(null);
        arrayList.add(null);

        System.out.println(arrayList);
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
