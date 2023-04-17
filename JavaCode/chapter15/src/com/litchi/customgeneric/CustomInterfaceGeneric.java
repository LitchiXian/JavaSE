package com.litchi.customgeneric;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IUsb<U, R> {

    int n = 10;//相当于 public static int n = 10;
//    U name;//接口中的属性都是静态的，静态不能使用泛型

    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8 中，可以在接口中，使用默认方法，也是可以使用泛型
    default R method(U u){
        return null;
    }
}

//泛型接口的类型,在**继承接口**或者**实现接口**时确定
interface IA extends IUsb<String, Integer>{}

class AA implements IA{
    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }
}

class BB implements IUsb<Double, Boolean>{

    @Override
    public Boolean get(Double aDouble) {
        return null;
    }

    @Override
    public void hi(Boolean aBoolean) {

    }

    @Override
    public void run(Boolean r1, Boolean r2, Double u1, Double u2) {

    }
}


//没有指定类型,默认为Object
class CC implements IUsb{
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}