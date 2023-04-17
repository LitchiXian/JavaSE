package com.litchi.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("litchi", 20, "服务端程序员");
        persons[1] = new Person("jack", 21, "前端程序员");
        persons[2] = new Person("kangkang", 19, "业务员");

        int len = persons.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                if (persons[j].getAge() > persons[j - 1].getAge()) {
                    Person p = persons[j];
                    persons[j] = persons[j - 1];
                    persons[j - 1] = p;
                }
            }
        }

        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
