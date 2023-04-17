package com.litchi.homework;

public class Homework05 {
    public static void main(String[] args) {
        Staff02[] staff = new Staff02[5];
        staff[0] = new Worker("litchi", 6000);
        staff[1] = new Peasant("jack", 4000);
        staff[2] = new Teacher02("tom", 2000, 100);
        staff[3] = new Scientist("kangk", 10000, 200000);
        staff[4] = new Waiter("jin", 3000);
        for (Staff02 s : staff) {
            if (s instanceof Teacher02) {
                Teacher02 t = (Teacher02) s;
                System.out.println(t.getName() + "(教师)一年工资为:" + (12 * (t.getSalary() + 25 * t.getClassRemuneration())));

            } else if (s instanceof Scientist) {
                Scientist sci = (Scientist) s;
                System.out.println(sci.getName() + "(科学家)一年工资为:" + (12 * sci.getSalary() + sci.getAnnualBonus()));
            } else if (s instanceof Staff02) {
                System.out.println(s.getName() + "一年工资为:" + 12 * s.getSalary());
            } else {
                System.out.println("类型出错");
            }
        }
    }
}

class Staff02 {
    private String name;
    private double salary;

    public Staff02(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

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

    @Override
    public String toString() {
        return "Staff02{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Worker extends Staff02 {
    public Worker(String name, double salary) {
        super(name, salary);
    }
}

class Peasant extends Staff02 {
    public Peasant(String name, double salary) {
        super(name, salary);
    }
}

class Teacher02 extends Staff02 {
    private double classRemuneration;//课酬

    public double getClassRemuneration() {
        return classRemuneration;
    }

    public void setClassRemuneration(double classRemuneration) {
        this.classRemuneration = classRemuneration;
    }

    public Teacher02(String name, double salary, double classRemuneration) {
        super(name, salary);
        this.classRemuneration = classRemuneration;
    }
}

class Scientist extends Staff02 {
    private double annualBonus;//年终奖

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public Scientist(String name, double salary, double annualBonus) {
        super(name, salary);
        this.annualBonus = annualBonus;
    }
}

class Waiter extends Staff02 {
    public Waiter(String name, double salary) {
        super(name, salary);
    }
}