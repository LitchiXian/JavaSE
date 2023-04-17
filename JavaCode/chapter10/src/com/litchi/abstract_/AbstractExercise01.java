package com.litchi.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager litchi = new Manager("litchi", 1, 4000, 10000);
        CommonEmployee jack = new CommonEmployee("jack", 2, 3000);
        litchi.work();
        jack.work();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(getName() + "管理在工作啦");
    }
}
class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "普通员工在工作啦");
    }
}