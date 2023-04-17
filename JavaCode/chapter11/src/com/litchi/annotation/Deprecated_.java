package com.litchi.annotation;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

//1.@Deprecated 修饰某个元素，表示该元素已经过时
//2.即不在推荐使用，但是仍然可以使用
//3.查看 @Deprecated 注解类的源码
//4.可以做到新旧版本的兼容和过渡
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
@Deprecated
class A{
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){
        System.out.println("A.hi");
    }
}