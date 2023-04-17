package com.litchi.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager litchi = new Manager("litchi", 500, 22);
        Employee jack = new Employee("jack", 200, 30);
        litchi.stringSalary();
        jack.stringSalary();
    }
}

class Staff {
    private String name;
    private double dailySalary;
    private int workDay;
    private double salary;

    static final int GRADE1 = 1;
    static final int GRADE2 = 2;

    public Staff(String name, double dailySalary, int workDay) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.workDay = workDay;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", dailySalary=" + dailySalary +
                ", workDay=" + workDay +
                ", salary=" + salary +
                '}';
    }

    public void stringSalary() {
        System.out.println(salary);
    }
}

class Manager extends Staff {
    public Manager(String name, double dailySalary, int workDay) {
        super(name, dailySalary, workDay);
        setSalary(1000 + dailySalary * workDay * GRADE2);
    }

    @Override
    public void stringSalary() {
        System.out.println(getName() + "经理 工资:");
        super.stringSalary();
    }
}

class Employee extends Staff {

    public Employee(String name, double dailySalary, int workDay) {
        super(name, dailySalary, workDay);
        setSalary(dailySalary * workDay * GRADE1);
    }

    @Override
    public void stringSalary() {
        System.out.println(getName() + "员工 工资:");
        super.stringSalary();
    }
}