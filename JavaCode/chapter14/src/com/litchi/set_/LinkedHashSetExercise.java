package com.litchi.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 林志贤
 * @version 1.0
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("小花猫", 200));
        set.add(new Car("法拉利", 2100));
        set.add(new Car("小花猫", 200));
        set.add(new Car("宝马", 100));

        for (Object o : set) {
            System.out.println("o=" + o);
        }
    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}