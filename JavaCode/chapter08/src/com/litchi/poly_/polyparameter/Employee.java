package com.litchi.poly_.polyparameter;

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //得到年工资的方法
    public double getAnnual(){
        return 12 * salary;
    }
}

class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工 " + getName() + "正在工作……");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
class Manager extends  Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理 " + getName() + "正在管理员工……");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}