package com.litchi.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 林志贤
 * @version 1.0
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("jack", 3000, new MyDate(2001, 1, 12)));
        list.add(new Employee("tom", 4000, new MyDate(2002, 8, 14)));
        list.add(new Employee("jack", 2000, new MyDate(2002, 13, 22)));

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i == 0) {
                    //下面是对 birthday 的比较，因此我们最好把这个比较，放在 MyDate 类完成
//                    if (o1.getBirthday().getYear() != o1.getBirthday().getYear())
//                        return o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                    if (o1.getBirthday().getMonth() != o1.getBirthday().getMonth())
//                        return o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//                    if (o1.getBirthday().getDay() != o1.getBirthday().getDay())
//                        return o1.getBirthday().getDay() - o2.getBirthday().getDay();
//                    return 0;
                    //封装后，将来可维护性和复用性，就大大增加
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return i;
            }
        });

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    @Override
    public int compareTo(MyDate o) {
        int i = year - o.getYear();
        if (i == 0) {
            int j = month - o.getMonth();
            if (j == 0) {
                int k = day - o.getDay();
                return k;
            }
            return j;
        }
        return i;
    }
}