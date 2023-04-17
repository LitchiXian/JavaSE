package com.litchi.interface_;

public class InterfaceDetail {
    public static void main(String[] args) {
        //接口中的属性都是 public static final
        System.out.println(IA.a);
        System.out.println(IA.b);
    }
}

interface IA {
    public static final int a = 1;
    int b = 2;

    public void work1();
    void work2();
}

interface IB extends IA{
    //接口可以继承接口
}

class AImpl implements IA, IB {

    @Override
    public void work1() {

    }

    @Override
    public void work2() {

    }
}
