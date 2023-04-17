package com.litchi.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.m1();

        //外部其他类 --- 访问 ----> 静态内部类
        //1.静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        Outer05.Inner05 inner05 = new Outer05.Inner05();
        inner05.say();
        //2.编写一个方法，返回静态内部类的对象
        Outer05.Inner05 inner05Instance = outer05.getInner05Instance();
        inner05Instance.say();
    }
}

class Outer05{
    private int n1 = 20;
    public static String name = "张三";

    private static void cry(){
        System.out.println("cry()...");
    }
    private void hi(){
        System.out.println("hi()...");
    }

    //可以添加任意访问修饰符（public、protect、默认、private）,因为它的地位就是一个成员
    public static class Inner05{
//        public int n1 = 120;
        public void say(){
            String name = "李四";
            //可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
//            System.out.println("n1 = " + n1);
            //静态内部类 --- 访问 ----> 外部类静态成员【访问方式：直接访问所有静态成员】
            System.out.println("Inner.name = " + name + "; Outer.name = " + Outer05.name);
            cry();
        }
    }

    public void m1(){
        //外部类 --- 访问 ----> 静态内部类【访问方式：创建对象，再访问】
        Inner05 inner05 = new Inner05();
        inner05.say();
    }

    public Inner05 getInner05Instance(){
        return new Inner05();
    }
}