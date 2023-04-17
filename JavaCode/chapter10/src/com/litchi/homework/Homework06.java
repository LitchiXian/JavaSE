package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", Factory.getHorse());
        tang.common();
        tang.passRiver();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("Horse work work work");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("Boat work work work");
    }
}

class Factory {
    private static Horse horse = new Horse();
    private static Boat bot = new Boat();

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return bot;
    }
}

class Person {
    private String name;
    private Vehicles vehicle;

    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }

    public void passRiver() {
        if (!(vehicle instanceof Boat)) {
            System.out.println("不是boat");
            vehicle = Factory.getBoat();
        }
        vehicle.work();
    }

    public void common() {
        if (!(vehicle instanceof Horse)) {
            System.out.println("不是horse");
            vehicle = Factory.getHorse();
        }
        vehicle.work();
    }
}