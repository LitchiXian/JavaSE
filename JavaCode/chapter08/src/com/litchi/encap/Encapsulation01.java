package com.litchi.encap;

public class Encapsulation01 {

    public static void main(String[] args) {
        Person p = new Person("jack", 21, 3000);
        System.out.println(p.toString());
        p.setAge(330);
        System.out.println(p.toString());
    }

}

class Person{
    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) this.name = name;
        else{
            System.out.println("名字的长度不对，需要（2 - 6）个字符，默认名字");
            this.name = "无名小子";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) this.age = age;
        else{
            System.out.println("你设置年龄不对，需要在（1 - 120），给默认年龄18");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}