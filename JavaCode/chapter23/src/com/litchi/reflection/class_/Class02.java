package com.litchi.reflection.class_;

import com.litchi.Car;

import java.lang.reflect.Field;

/**
 * @author 林志贤
 * @version 1.0
 * 演示Class类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "com.litchi.Car";
        //1.获取到Car类，对应的Class对象
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2.输出cls
        System.out.println(cls);//显示cls对象，是哪个类的Class对象 com.litchi.Car
        System.out.println(cls.getClasses());//输出cls运行类型 java.lang.Class

        //3.得到包名
        System.out.println(cls.getPackage());//package com.litchi
        //4.得到类名
        System.out.println(cls.getName());
        //5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car.toString());
        //6.通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        //7.通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));
        //8.遍历所有的属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
