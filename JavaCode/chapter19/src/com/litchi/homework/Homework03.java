package com.litchi.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        properties.store(new FileWriter(filePath), "It is homework03");

        properties = null;
        properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.getProperty("name");
        Integer age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println(dog.toString());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\dog.dat"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src\\dog.dat"));
        Object o = objectInputStream.readObject();
        Dog dd = (Dog) o;
        System.out.println(dd.toString());
        objectInputStream.close();
    }
}

class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}