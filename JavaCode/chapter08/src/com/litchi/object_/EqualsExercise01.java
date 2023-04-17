package com.litchi.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("litchi", 20, 'm');
        Person p = person;
        Person person2 = new Person("litchi", 20, 'm');
        System.out.println(person.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

//    public boolean equals(Person p) {
//        if (this == p) {
//            return true;
//        }
//        if (!p.name.equals(name)) return false;
//        if (p.age != age) return false;
//        if (p.gender != gender) return false;
//        return true;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//判断是否是同一个对象
            return true;
        }
        if (obj instanceof Person) {//判断类型是否相同
            //向下转型，得到obj的各个属性
            Person p = (Person) obj;
            //判断各个属性是否相同
//            if (!p.name.equals(name)) return false;
//            if (p.age != age) return false;
//            if (p.gender != gender) return false;
//            return true;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}