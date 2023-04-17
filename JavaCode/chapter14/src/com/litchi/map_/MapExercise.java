package com.litchi.map_;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Employee(1, "litchi", 20000));
        map.put(2, new Employee(2, "jack", 10000));
        map.put(3, new Employee(3, "tom", 19000));

        //第一种
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee em = (Employee) entry.getValue();
            if (em.getSal()>18000)
                System.out.println(em);
        }

        //第二种
        Collection values = map.values();
        for (Object value : values) {
            Employee em = (Employee) value;
            if (em.getSal() > 18000)
                System.out.println(em);
        }
    }
}

class Employee{
    private int id;
    private String name;
    private double sal;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}
