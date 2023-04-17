package com.litchi.try_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TryCatch02 {
    public static void main(String[] args) {
        //可以有多个catch语句，捕获不同的异常(进行不同的业务处理),
        // 要求父类异常在后,子类异常在前，比如(Exception在后，NullPointerException在前)，如果发生异常，只会匹配一个
        try {
            Person person = new Person();
            //person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("不管是否有异常");
        }

        System.out.println("程序继续....");
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}
