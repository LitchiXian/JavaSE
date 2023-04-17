package com.litchi.reflection.classload_;

/**
 * @author 林志贤
 * @version 1.0
 * 演示类加载-初始化阶段
 */
public class ClassLoad03 {
    public static void main(String[] args) throws ClassNotFoundException {

        //分析
        // 1.加载B类，并生成 B 的class对象
        // 2.连接 num = 0
        // 3.初始化阶段
        //    依次自动收集类中的所有**静态变量**的赋值动作和**静态代码块**中的语句,并进行合并。
        /*
            clinit() {
                System.out.println("B 静态代码块被执行");
                //num = 300;
                num = 100;
            }

            合并: num = 100
         */
//        new B();
//        System.out.println(B.num);//100,如果直接使用类的静态属性，也会导致类的加载

        //看看加载类的时候，是有同步机制控制
//        Class<?> b = Class.forName("B");
        new B();
        /*
        protected Class<?> loadClass(String name, boolean resolve)
        throws ClassNotFoundException
        {
            //正因为有这个机制，才能保证某个类在内存中，只有一份Class对象
            synchronized (getClassLoadingLock(name)) {
            //.....
            }
        }
         */
    }
}

class B{
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {
        System.out.println("B 构造器被执行");
    }
}