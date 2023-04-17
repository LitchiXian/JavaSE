package com.litchi.everyday;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Set_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        hashSet.add("Hello");

        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        strings.add("Hello");
        strings.add("world");

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(5);
        linkedHashSet.add("Hello");
    }
}
