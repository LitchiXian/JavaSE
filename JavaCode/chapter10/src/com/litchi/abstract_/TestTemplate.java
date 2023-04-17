package com.litchi.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        A a = new A();
        a.calculateTime();
        B b = new B();
        b.calculateTime();
    }
}

class A extends Template{

//    public void calculateTime(){
//        long start = System.currentTimeMillis();
////        job();
//        job2();
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间 = " + (end - start));
//    }
    //计算任务 1 + .....+ 10000
    public void job() {
//        long start = System.currentTimeMillis();

        int num = 0;
        for (int i = 0; i < 10000000; i++) {
            num += i;
        }

//        long end = System.currentTimeMillis();
//        System.out.println("执行时间 = " + (end - start));
    }

    public void job2() {
//        long start = System.currentTimeMillis();

        int num = 0;
        for (int i = 0; i < 10000; i++) {
            num += i;
        }

//        long end = System.currentTimeMillis();
//        System.out.println("执行时间 = " + (end - start));
    }
}

class B extends Template{

//    public void calculateTime(){
//        long start = System.currentTimeMillis();
////        job();
//        job();
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间 = " + (end - start));
//    }

    public void job() {
//        long start = System.currentTimeMillis();

        int num = 0;
        for (int i = 0; i < 10000000; i++) {
            num *= i;
        }

//        long end = System.currentTimeMillis();
//        System.out.println("执行时间 = " + (end - start));
    }
}