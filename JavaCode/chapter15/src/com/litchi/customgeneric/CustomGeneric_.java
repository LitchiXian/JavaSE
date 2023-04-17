package com.litchi.customgeneric;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

//1.Tiger 后面泛型，所以我们把 Tiger 称为自定义泛型类
//2.T, R, M 泛型的标识符，一般是单个字母大写
//3.泛型标识符可以有多个
//4.普通成员可以使用泛型（属性、方法）
//5.使用泛型的数组，不能初始化
class Tiger<T, R, M>{
    String name;
    R r;
    M m;
    T t;
    //因为数组在new 不能确定T的类型，就无法在内存开空间
//    T[] ts = new T[8];//使用泛型的数组，不能初始化
    T[] ts;//使用泛型的数组，不能初始化

    //因为静态是和类相关的，在类加载时，对象还没有创建
    //所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化
//    public static void m1(M m){}
//    static R r2;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}