package com.litchi.generic;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        Student jack = new Student("jack", 19);
        Student tom = new Student("tom", 16);
        Student smith = new Student("smith", 20);

        HashSet<Student> students1 = new HashSet<>();
        students1.add(jack);
        students1.add(tom);
        students1.add(smith);
        HashMap<String, Student> students2 = new HashMap<>();
        students2.put(jack.name, jack);
        students2.put(tom.name, tom);
        students2.put(smith.name, smith);

        for (Student student : students1) {
            System.out.println(student.name + ":" + student.age + "岁");
        }
        System.out.println("=====================");
        Iterator<String> iterator = students2.keySet().iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(students2.get(s).name + ":" + students2.get(s).age + "岁");
        }
        System.out.println("=====================");
        Iterator<Student> iterator2 = students2.values().iterator();
        while (iterator2.hasNext()) {
            Student next = iterator2.next();
            System.out.println(next.name + ":" + next.age + "岁");
        }
        System.out.println("=====================");
        Set<Map.Entry<String, Student>> entries = students2.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey() + "---" + next.getValue().name + ":" + next.getValue().age + "岁");
        }
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}