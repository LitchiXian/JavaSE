package com.litchi.homework;

public class Homework03 {
    public static void main(String[] args) {
        Teacher t;
        t = new Teacher("litchi", 24, "普通老师", 3000);
        System.out.println(t.introduce());
        t = new Lecturer("litchi", 27, 3000);
        System.out.println(t.introduce());
        t = new AssociateProfessor("litchi", 30, 3000);
        System.out.println(t.introduce());
        t = new Professor("litchi", 40,  3000);
        System.out.println(t.introduce());
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;//职称
    private double salary;//基本工资

    static final double GRADE1 = 1.5;
    static final double GRADE2 = 2.0;
    static final double GRADE3 = 3.0;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String introduce() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary;
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, double salary) {
        super(name, age, "教授", salary * GRADE3);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}

class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, double salary) {
        super(name, age, "副教授", salary * GRADE2);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}

class Lecturer extends Teacher {
    public Lecturer(String name, int age, double salary) {
        super(name, age, "讲师", salary * GRADE1);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}