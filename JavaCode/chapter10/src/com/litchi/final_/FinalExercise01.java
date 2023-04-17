package com.litchi.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
