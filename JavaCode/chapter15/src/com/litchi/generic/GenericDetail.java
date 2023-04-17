package com.litchi.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 林志贤
 * @version 1.0
 */
public class GenericDetail {
    public static void main(String[] args) {
        //1. T，E 只能是引用类型,不能基本数据类型
        List<Integer> list = new ArrayList<Integer>();//ok
//        List<int> list2 = new ArrayList<int>();//错误 Type argument cannot be of primitive type
        //2. 在给泛型指定具体类型后，可以传入该类型或其子类类型
        Pig<A> aPig = new Pig<A>(new A());//传入该类型
        Pig<A> aPig2 = new Pig<A>(new B());//子类类型
        //3. 泛型使用形式
        List<Integer> list1 = new ArrayList<Integer>();
        //在实际开发中，我们往往简写(推荐)
        //编译器进行类型推断
        List<Integer> list2 = new ArrayList<>();//说明
        //4. 如果我们这样写 List list3 = new ArrayList(); 默认给它的 泛型是[<E> E 就是 Object]
        List list3 = new ArrayList();//相当于 List<Object> list3 = new ArrayList<>();

        Pig<Object> pig = new Pig<>();
        /*
            class Pig{
                Object e;

                public Pig() {
                }

                public Pig(Object e) {
                    this.e = e;
                }
            }
         */

    }
}

class A{}

class B extends A{}

class Pig<E>{
    E e;

    public Pig() {
    }

    public Pig(E e) {
        this.e = e;
    }
}