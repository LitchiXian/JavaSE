package com.litchi.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m1();
        System.out.println(outer01);
    }
}

class Outer01 {
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer01.m2()");
    }

    public void m1() {
        //局部内部类是定义再外部类的局部位置，通常在方法
        final class Inner {//局部内部类
        //不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是
        // 不能使用修饰符的。但是可以使用final 修饰，因为局部变量也可以使用final
            private int n1 = 20;
            //可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                //局部内部类 --- 访问 ---> 外部类的成员【访问方式：直接访问】
                System.out.println("n1 = " + n1);
                m2();

                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问
                System.out.println("n1 = " + n1 + "; Outer01.n1 = " + Outer01.this.n1);
                System.out.println(Outer01.this);
            }
        };
        //局外部类 --- 访问 ---> 局部内部类的成员
        //访问方式：创建对象，再访问（注意：必须再作用域内）
        Inner inner = new Inner();
        inner.f1();
    }
}
