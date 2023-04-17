package com.litchi.homework;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car();
        Car.A a = car.new A();
        car.setTemperature(45);
        a.watch();
        car.setTemperature(-2);
        a.watch();
        car.setTemperature(3);
        a.watch();
    }
}

class Car{
    private double temperature;

    public class A{
        public void flow(){
            System.out.println("开空调咯");
        }
        public void watch(){
            if (temperature > 40){
                System.out.println("吹冷气");
                flow();

            } else if (temperature < 0) {
                System.out.println("吹暖气");
                flow();
            }else {
                System.out.println("关空调了");
            }
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}