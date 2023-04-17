package com.litchi.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie jack1 = new Movie("jack");
        Movie jack2 = new Movie("jack", 20);
        Movie jack3 = new Movie("jack", 30, "很久很久以前");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;


    //下面三个构造器都有相同的语句
    //这样代码看起来比较冗余
    //这时我们可以把相同的语句，放入到一个代码块中，即可
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("电影屏幕打开。。。");
        System.out.println("广告。。。");
        System.out.println("电影正式开始。。。");
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开。。。");
//        System.out.println("广告。。。");
//        System.out.println("电影正式开始。。。");
        this.name = name;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开。。。");
//        System.out.println("广告。。。");
//        System.out.println("电影正式开始。。。");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开。。。");
//        System.out.println("广告。。。");
//        System.out.println("电影正式开始。。。");
        this.name = name;
        this.price = price;
    }
}