package com.litchi.customgeneric;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("jack", 20);//当调用方法时，传入参数，编译器，就会确定类型
    }
}

//泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car{
    public void run(){//普通方法

    }

    //说明
    //1. <T, R> 就是泛型
    //2. 是提供给 fly 使用的
    public <T, R> void fly(T t, R r){//泛型方法

    }
}

class Fish<T, R>{//泛型类
    public void run(){//普通方法

    }

    public <U, M> void eat(U u, M m, T t, R r){//泛型方法
        //泛型方法，可以使用类声明的泛型，也可以使用自己声明的泛型
    }

    //下面这个fly方法，不是泛型方法
    //是fly方法使用了类声明的 泛型
    public void fly(T t, R r){//泛型方法

    }


}