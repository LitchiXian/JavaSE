package com.litchi.single_;

public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend instance = GirlFriend.getInstance();
//        GirlFriend instance2 = GirlFriend.getInstance();
//        System.out.println(instance == instance2);

        //饿汉式缺陷
        System.out.println(GirlFriend.n1);
        //这就已经创建了gf对象了，资源浪费了

        System.out.println(Cat.n1);
        Cat cat = Cat.getInstance();
//        Cat cat2 = Cat.getInstance();
//        System.out.println(cat2 == cat);
        //懒汉式存在线程安全问题（后面学习线程后，会完善一把）
//        Runtime
//        在我们 JavaSE标准类中，java.lang.Runtime就是经典的单例设计模式
    }
}

//饿汉式单例设计模式
class GirlFriend {

    private String name;

    public static int n1 = 100;
    //饿汉式单例设计模式
    //1. 构造器私有化
    //2. 类的内部创建对象
    //3. 向外暴露一个静态的公共方法
    private GirlFriend(String name) {
        System.out.println("构造了gf对象。。。。。。");
        this.name = name;
    }

    private static GirlFriend gf = new GirlFriend("rose");

    public static GirlFriend getInstance() {
        return gf;
    }

}

//懒汉式单例设计模式
class Cat {

    private String name;

    public static int n1 = 100;
    //懒汉式单例设计模式
    //1. 构造器私有化
    //2. 类的内部创建对象
    //3. 向外暴露一个静态的公共方法
    private Cat(String name) {
        System.out.println("构造了cat对象。。。。。。");
        this.name = name;
    }

    private static Cat cat;

    public static Cat getInstance() {
        if (cat == null){
            cat = new Cat("rose");
        }
        return cat;
    }

}