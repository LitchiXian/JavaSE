package com.litchi.innerclass;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method();
    }
}

class Outer02 {
    private int n1 = 10;

    public void method() {
        System.out.println("Outer02.method()");
        //基于接口的匿名内部类
        //1.需求：想使用IA接口，并创建对象
        //2.传统方式：是写一个类，实现该接口，并创建对象
//        IA tiger = new Tiger();
//        tiger.cry();
        //3.Tiger/Dog类只是使用一次，后面再也不使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型是 ？ IA
        //6.tiger的运行类型是 ？ 就是匿名内部类 XX => Outer02$1
        /*
        我们看底层
        class XX implements IA {
            @Override
            public void cry() {
                System.out.println("老虎咆哮...");
            }
        }
         */
        //7.jdk底层在创建匿名内部类 Outer04$1, 立即马上就创建了 Outer04$1实例，并且把地址返回给tiger
        //8.匿名内部类使用一次,就不能再使用了
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎咆哮...");
            }
        };
        System.out.println("tiger的运行类型 = " + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //演示基于类的匿名内部类
        //分析
        //1.father 的编译类型是 ？ Father
        //2.father 的运行类型是 ？ Outer02$2 [不是Father哦，注意哦！！！]
        /*
        我们看底层
        class Outer02$2 extends father {
            @Override
                public void test() {
                    System.out.println("匿名内部类的重写test");
                }
        }
         */
        //3.同时也直接返回了 匿名内部类Outer02$2地址给father1
        Father father1 = new Father("litchi") {
            @Override
            public void test() {
                System.out.println("匿名内部类的重写test");
            }
        };
        Father father2 = new Father("litchi");
        System.out.println(father1.getClass());
        System.out.println(father2.getClass());

        father1.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("匿名内部类的animal eat（）。。。");
            }
        };
        animal.eat();
    }
}

interface IA {//接口

    void cry();
}

//class Tiger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("Tiger.cry()");
//    }
//}
//
//class Dog implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("Dog.cry()");
//    }
//}

class Father {
    public Father(String name) {
        //构造器
        System.out.println("name = " + name);
    }

    public void test() {
        //方法
    }
}

abstract class Animal{//抽象类
    abstract void eat();
}