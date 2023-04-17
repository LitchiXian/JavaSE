package com.litchi.innerclass;

public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}

class Outer {
    //属性
    private int n1 = 1;

    //方法
    public void cry(){
        System.out.println("cry(),,,,");
    }

    //构造器
    public Outer(int n1) {
        this.n1 = n1;
    }

    //代码块
    {
        System.out.println("Outer {}.....");
    }

    //内部类
    class Inner{

    }
}
