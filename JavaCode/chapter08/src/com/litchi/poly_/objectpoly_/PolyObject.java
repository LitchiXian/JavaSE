package com.litchi.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态
        //animal 编译类型就是 Animal，运行类型 Dog
        Animal animal = new Dog();
        //因为运行时，执行到该行时，animal运行类型是Dog，所以cry是Dog的cry
        animal.cry();
        //animal 编译类型就是 Animal，运行类型 Cat
        animal = new Cat();
        animal.cry();
    }
}
