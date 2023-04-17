package com.litchi.throws_;

import java.io.FileNotFoundException;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {
        f1();

    }

    public static void f1() {
        int n1 = 19;
        int n2 = 0;
        int res = n1 / n2;
    }

    public void f2(){
        //这里会报错
        //因为f3抛出的是编译异常
        //在f1中，要么 try-catch-finally，或者继续throws这个编译异常
        //f3();
    }
    public void f3() throws FileNotFoundException {}

    public void f4(){
        //在调用f5是ok的
        //原因f5是运行时异常
        //而java中并不要求程序员显示处理，因为有默认处理机制
        f5();
    }

    public void f5() throws RuntimeException{}
}

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father{
    //子类重写父类的方法时，对抛出异常的规定:子类重写的方法，
    // 所抛出的异常类型要么和父类抛出的异常一致,要么为父类抛出的异常的类型的子类型
    @Override
    public void method() throws NullPointerException {
    }
}
