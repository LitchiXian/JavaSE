package com.litchi.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        System.out.println(C.TAX_RATE);
        //C的static{} 没有被调用

//        包装类（Integer, Double, Float, Boolean 等都是final类），String也是final类
//        String
    }
}

class A {
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;

//    {
//        TAX_RATE2 = 0.08;
//    }

    public A() {
        this.TAX_RATE2 = 0.08;
    }
}

final class B {
    //一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
    public void cry() {
    }
}

class C {
    //    final 和 static 往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
    public final static double TAX_RATE = 0.08;//不会导致类加载！！！

    static {
        System.out.println("C static {} ....");
    }

    {
        System.out.println("C  {} ....");
    }
}