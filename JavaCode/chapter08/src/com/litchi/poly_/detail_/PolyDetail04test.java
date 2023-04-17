package com.litchi.poly_.detail_;

public class PolyDetail04test {
    public static void main(String[] args) {
        AAA a = new BBB();
        //java的动态绑定机制（非常非常重要）
        //1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        //2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
        System.out.println(a.i);
        System.out.println(a.getI());
    }
}

class AAA {
    public int i = 20;

    public int getI() {
        return i;
    }
}

class BBB extends AAA {
    public int i = 10;

    @Override
    public int getI() {
        return i;
    }
}