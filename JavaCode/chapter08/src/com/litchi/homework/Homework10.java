package com.litchi.homework;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor01 = new Doctor("litchi", 21, "程序员", '男', 3000);
        Doctor doctor02 = new Doctor("litchi", 21, "程序员", '男', 3000);
        System.out.println(doctor01.equals(doctor02));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;//工资

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (obj instanceof Doctor) {
            Doctor doctor = (Doctor) obj;
            return name.equals(doctor.name) && doctor.age == age && job.equals(doctor.job) && doctor.gender == getGender() && doctor.sal == sal;
        }
        return false;
    }
}
