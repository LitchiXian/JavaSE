package com.litchi.reflection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 林志贤
 * @version 1.0
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api_02() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("com.litchi.reflection.Person");
        //getDeclaredFields : 获取本类中所有属性
        //[**说明** : 默认修饰符是0，public是 1 , private是 2 , protected是 4 ，static是8 , final是16]， public(1) + static (8) = 9
        //第二组方法API
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName()
                    + " 该属性的修饰符=" + declaredField.getModifiers()
                    + " 该属性的类型=" + declaredField.getType()
            );

        }
        System.out.println("=================");

        //第三组方法API
        //getDeclaredMethods : 获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
                    + " 该方法的访问修饰符=" + declaredMethod.getModifiers()
                    + " 该方法的返回的类型=" + declaredMethod.getReturnType()
            );

            //getParameterTypes : 以 Class[] 返回参数类型数组
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型=" + parameterType);
            }
        }
        System.out.println("=============================");
        //第三组方法API
        // getDeclaredConstructors : 获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类的所有构造器=" + declaredConstructor.getName());
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
    }

    //第一组方法API
    @Test
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("com.litchi.reflection.Person");
        //1. getName : 获取全类名
        System.out.println(personCls.getName());//com.litchi.reflection.Person
        //2. getSimpleName : 获取简单类名
        System.out.println(personCls.getSimpleName());//Person
        //3. getFields : 获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();//只有public属性
        for (Field field : fields) {
            System.out.println("本类以及父类的属性=" + field.getName());
        }
        System.out.println("====================");
        //4. getDeclaredFields : 获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName());
        }
        System.out.println("====================");

        //5. getMethods : 获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类及父类的方法=" + method.getName());
        }
        System.out.println("====================");
        //6. getDeclaredMethods : 获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName());
        }
        System.out.println("====================");
        //7. getConstructors : 获取本类所有public修饰的构造器
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的构造器=" + constructor.getName());
        }
        System.out.println("====================");
        //8. getDeclaredConstructors : 获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类的所有构造器=" + declaredConstructor.getName());
        }
        System.out.println("====================");
        //9. getPackage : 以Package形式返回包信息
        System.out.println(personCls.getPackage());
        //10. getSuperClass : 以Class形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println(superclass.getName());
        //11. getlnterfaces : 以Class[形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }
        //12. getAnnotations : 以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);
        }
    }
}

interface IA {
}

interface IB {
}

class A {
    public String hobby;

    public void hi() {
    }

    public A() {
    }
}

@Deprecated
class Person extends A
        implements IA, IB {
    //属性
    public static String name;
    protected int age;
    String job;
    private double sal;

    //方法
    public void m1() {
    }

    protected Integer m2() {
        return null;
    }

    int m3() {
        return 1;

    }

    private String m4(String name, int a) {
        return null;

    }

    public Person() {
    }

    public Person(String name) {
    }

    private Person(int a) {
    }
}
