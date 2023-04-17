package com.litchi.set_;


import java.util.HashSet;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //1.在执行add方法后，会返回一个boolean值
        //2.如果添加成功，返回 true，否则返回 false
        //3.可以通过 remove 指定删除哪个对象
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T
        set.remove("john");
        System.out.println("set=" + set);

        //不能有重复元素/对象。在前面 Set 接口使用已经讲过
        set = new HashSet();
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        Dog jak = new Dog("jak");
        set.add(jak);
        set.add(jak);
        System.out.println("set=" + set);

        //看源码，做分析，先给小伙伴留个坑，以后讲完源码，就懂了
        //去看他的源码，及add到底发生了什么？ => 底层机制
        set.add(new String("hsp"));//OK
        set.add(new String("hsp"));//加入不了
        System.out.println("set=" + set);
    }
}

class Dog{
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}