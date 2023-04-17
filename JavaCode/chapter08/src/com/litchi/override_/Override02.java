package com.litchi.override_;

public class Override02 {
    public static void main(String[] args) {
        Person person = new Person("jack", 21);
        Student student = new Student("litchi", 21, 1, 99);
        System.out.println(person.toString());
        System.out.println("=============");
        System.out.println(student.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    private int id;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "id=" + id +
                ", score=" + score +
                '}';
    }
}