package com.litchi.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.f1();
    }
}

class Outer03{
    private int n1 = 99;
    public void f1(){
        //创建一个基于类的匿名内部类
        Person p = new Person(){
            int n1 = 100;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi方法的n1 = " + n1 + ";Outer03.n1 = " + Outer03.this.n1);
            }
        };
        p.hi();//动态绑定，运行类型是 Outer03$1

//        //也可以直接调用
//        new Person(){
//            @Override
//            public void cry(String name) {
//                System.out.println("第二个匿名内部类重写cry方法");
//            }
//        }.cry("jack");//直接调用
    }
}

class Person{
    public void hi(){
        System.out.println("hi...");
    }
    public void cry(String name){
        System.out.println("cry " + name);
    }
}