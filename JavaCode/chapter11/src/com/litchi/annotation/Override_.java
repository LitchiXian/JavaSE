package com.litchi.annotation;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {
//        Throwable
    }
}

class Father{
    public void fly(){
        System.out.println("Father fly...");
    }
}

class Son extends Father{
    //1.@Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly
    //2.这里如果没有 @Override 还是重写了父类fly
    //3.如果你写了 @Override注解，编译器就会去检查该方法是否真的重写了父类的
    //  方法，如果的确重写了，则编译通过，如果没有构成重写，则编译报错
    //4.看看 @Override 的定义
    //  如果发现 @interface 表示一个注解类
    /*
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
     */
    @Override
    public void fly(){
        System.out.println("Son fly...");
    }
}
