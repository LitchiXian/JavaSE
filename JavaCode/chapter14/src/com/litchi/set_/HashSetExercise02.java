package com.litchi.set_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author 林志贤
 * @version 1.0
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2002, 8, 30);
        LocalDate localDate2 = LocalDate.of(2001, 12, 30);

        hashSet.add(new Employee2("litchi", 1000, new MyDate(localDate)));
        hashSet.add(new Employee2("jack", 2000, new MyDate(localDate)));
        hashSet.add(new Employee2("litchi", 3000, new MyDate(localDate2)));
        hashSet.add(new Employee2("litchi", 4000, new MyDate(localDate)));

        for (Object o : hashSet) {
            System.out.println("o=" + o);
        }



    }
}

class Employee2 {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee2(String name, int sal, MyDate birthday) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(LocalDate localDate) {
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}