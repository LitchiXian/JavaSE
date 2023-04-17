package com.litchi.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用指向子类的对象
        //语法：父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();

//        //因为在编译阶段，能调用哪些成员，是由编译类型来决定的
//        animal.catchMouse();
//        1. 本质：父类的引用指向了子类的对象
//        2. 语法：父类类型 引用名 = new 子类类型();
//        3. 特点：编译类型看左边，运行类型看右边
//        可以调用父类中的所有成员（需遵守访问权限）
//        不能调用子类中特有成员
//        最终运行效果看子类的具体实现
        animal.eat();
        animal.run();
        animal.show();

        //向下转型
        //编译类型是 Cat，运行类型是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        cat.eat();
        //要求父类的引用必须指向的是当前目标类型的对象
        //就是要求animal原先是指向Cat，你不能转成狗
//        Dog dog = (Dog) animal;//会抛出异常
    }
}
