package com.litchi.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

//        Movie1.say();
        System.out.println("==================");
        System.out.println(Movie1Son.a);
        System.out.println("======================");
//        Movie jack1 = new Movie("jack");
//        Movie jack2 = new Movie("jack", 20);
//        Movie jack3 = new Movie("jack", 30, "很久很久以前");
    }
}

class Movie1 {
    private String name;
    private double price;
    private String director;


    //下面三个构造器都有相同的语句
    //这样代码看起来比较冗余
    //这时我们可以把相同的语句，放入到一个代码块中，即可
    static {
        System.out.println("静态代码块==============");
    }

    {
        System.out.println("电影屏幕打开。。。");
        System.out.println("广告。。。");
        System.out.println("电影正式开始。。。");
    }

    public static int i = 10;

    public static void say() {
        System.out.println("i = " + i);
    }

    public Movie1(String name) {
//        System.out.println("电影屏幕打开。。。");
//        System.out.println("广告。。。");
//        System.out.println("电影正式开始。。。");
        this.name = name;
        System.out.println("father 构造器");
    }

    public Movie1(String name, double price, String director) {
//        System.out.println("电影屏幕打开。。。");
//        System.out.println("广告。。。");
//        System.out.println("电影正式开始。。。");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie1(String name, double price) {
//        System.out.println("电影屏幕打开。。。");
//        System.out.println("广告。。。");
//        System.out.println("电影正式开始。。。");
        this.name = name;
        this.price = price;
    }
}

class Movie1Son extends Movie1 {

    public static int a = 10;

    static {
        System.out.println("son static {}");
    }

    {
        System.out.println("son {}");
    }

    public Movie1Son(String name) {
        super(name);
        System.out.println("son 构造器");
    }


}