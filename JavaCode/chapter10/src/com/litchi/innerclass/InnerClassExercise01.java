package com.litchi.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一副名画...");
            }
        });
        //传统写法
        f1(new LImpl());
    }

    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}

// 类 -> 实现IL => 编程领域(硬编码)
class LImpl implements IL{
    @Override
    public void show() {
        System.out.println("这是传统方法的名画");
    }
}