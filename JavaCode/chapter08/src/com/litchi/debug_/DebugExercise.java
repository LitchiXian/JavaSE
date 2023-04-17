package com.litchi.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        //创建对象流程
        //1.加载 Person类信息
        //2.初始化 2.1默认初始化，2.2显示初始化，2.3构造器初始化
        //3.返回对象地址
        Person litchi = new Person("litchi", 21);
        System.out.println(litchi);
    }
}

class Person{
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
