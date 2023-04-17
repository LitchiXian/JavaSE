package com.litchi.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework01 {
    @Test
    public void m1() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1", new User(1, "tom", 20));
        userDAO.save("2", new User(2, "jack", 10));
        userDAO.save("3", new User(3, "litchi", 30));
        User user = userDAO.get("3");
        System.out.println("====================");
        System.out.println(user);
        System.out.println("====================");

        List<User> list = userDAO.list();
        for (User user1 : list) {
            System.out.println(user1);
        }

        userDAO.update("2", new User(2, "汤姆", 100));

        userDAO.delete("3");
        list = userDAO.list();
        System.out.println("====================");

        for (User user1 : list) {
            System.out.println(user1);
        }

        //可能会问为啥不直接输出map.values()
        //弹幕强调说
        //不要这样遍历 map.values()，不要在循环中调用get()方法，同样的道理不要在遍历中访问数据库
        /*
        所以这个相当于从数据库拿出数据
            public List<T> list() {
                Set<String> strings = map.keySet();
                List<T> list = new ArrayList<>();
                //遍历map
                for (String string : strings) {
                    list.add(map.get(string));
                }

                return list;
            }
         */

    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        Set<String> strings = map.keySet();
        List<T> list = new ArrayList<>();
        //遍历map
        for (String string : strings) {
            list.add(map.get(string));
        }

        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}