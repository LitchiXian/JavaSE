package com.litchi.homework;

public class Homework13 {

    public static void main(String[] args) {
        Person03[] p = new Person03[4];
        p[0] = new Student01("jack", '女', 21, "001");
        p[1] = new Student01("litchi", '男', 20, "002");
        p[2] = new Teacher01("五六七", '男', 30, 10);
        p[3] = new Teacher01("阿梅", '女', 33, 13);

        int len = p.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                if (p[j].getAge() > p[j - 1].getAge()) {
                    Person03 temp = p[j];
                    p[j] = p[j - 1];
                    p[j - 1] = temp;
                }
            }
        }

        for (Person03 pp : p) {
            System.out.println("=================");
            System.out.println(pp.toString());
        }
        System.out.println("=================");

        for (Person03 pp : p) {
            play(pp);
        }
    }

    public static void play(Person03 p) {
        if (p instanceof Student01) {
            Student01 s = (Student01) p;
            System.out.println(s.study());
        } else if (p instanceof Teacher01) {
            Teacher01 t = (Teacher01) p;
            System.out.println(t.teach());
        }
    }
}

class Person03 {
    private String name;
    private char sex;
    private int age;

    public Person03(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return null;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                "\nsex=" + sex +
                "\nage=" + age;
    }
}

class Student01 extends Person03 {
    private String stuId;

    public Student01(String name, char sex, int age, String stuId) {
        super(name, sex, age);
        this.stuId = stuId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String study() {
        return "我承诺，我会好好学习";
    }

    @Override
    public String play() {
        return getName() + "爱玩足球";
    }

    @Override
    public String toString() {
        return "学生的信息:\n" +
                super.toString() +
                "\n" + study() +
                "\n" + play();
    }
}

class Teacher01 extends Person03 {
    private int workAge;

    public Teacher01(String name, char sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String teach() {
        return "我承诺，我会认真教学";
    }

    @Override
    public String play() {
        return getName() + "爱下象棋";
    }

    @Override
    public String toString() {
        return "老师的信息:\n" +
                super.toString() +
                "\n" + teach() +
                "\n" + play();
    }
}