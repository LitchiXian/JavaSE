package com.litchi.generic;

/**
 * @author 林志贤
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {

        //注意，特别强调：E具体的数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
        Person<String> jack = new Person<>("jack");
        jack.t();
        //你可以这样理解 String 代替了E
        /*
            class Person {
                String s;//泛型可以在属性的类型,该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

                public Person(String s) {//泛型可以在参数类型
                    this.s = s;
                }

                public String f() {//泛型可以在返回值的类型
                    return s;
                }
            }
         */
        Person<Integer> integerPerson = new Person<>(2);
        integerPerson.t();
        //那这个一样的 Integer 代替了 E
        /*
            class Person {
                Integer s;//泛型可以在属性的类型,该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

                public Person(Integer s) {//泛型可以在参数类型
                    this.s = s;
                }

                public Integer f() {//泛型可以在返回值的类型
                    return s;
                }
            }
         */
        Person<String> nihao = new Person<>("nihao");
        nihao.t();
        System.out.println(jack + "\n" + integerPerson);
    }
}

//泛型的作用是 : 可以在类声明时通过一个标识表示类中某个属性的类型，
// 或者是某个方法的返回值的类型 , 或者是参数类型
class Person<E> {
    E s;//泛型可以在属性的类型,该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

    public Person(E s) {//泛型可以在参数类型
        this.s = s;
    }

    public E f() {//泛型可以在返回值的类型
        return s;
    }

    public void t(){
        System.out.println(s.getClass());
    }
}