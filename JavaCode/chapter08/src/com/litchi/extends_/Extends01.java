package com.litchi.extends_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(68);
        pupil.show();

        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(98);
        graduate.show();
    }
}

//父类 --> 学生
class Student {
    public String name;
    public int age;
    private double score;

    //但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

//小学生
class Pupil extends Student {
//    public String name;
//    public int age;
//    private double score;
//
//    public void setScore(double score) {
//        this.score = score;
//    }

    public void testing() {
        System.out.println("小学生 " + name + "正在考数学……");
    }

    public void show() {
//        System.out.println("小学生 " + name + "数学成绩为 " + score);
        System.out.println("小学生 " + name + "数学成绩为 " + getScore());
    }
}

//大学生
class Graduate extends Student {
//    public String name;
//    public int age;
//    private double score;
//
//    public void setScore(double score) {
//        this.score = score;
//    }

    public void testing() {
        System.out.println("大学生 " + name + "正在考高等数学");
    }

    public void show() {
//        System.out.println("大学生 " + name + ",年龄 " + age + ",高等数学成绩为： " + score);
        System.out.println("大学生 " + name + ",年龄 " + age + ",高等数学成绩为： " + getScore());
    }
}
