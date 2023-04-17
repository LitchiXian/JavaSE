package com.litchi.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.t1();

        //外部其他类 --- 访问 ----> 成员内部类
        //1.outer04.new Inner04(); 相当于 new Inner04() 当做是outer04成员
        Outer04.Inner04 inner04 = outer04.new Inner04();
        inner04.say();
        //2.在外部类中，编写一个方法，可以返回 Inner04 对象
        Outer04.Inner04 inner04Instance = outer04.getInner04Instance();
        inner04Instance.say();
        //3.
//        Outer04.Inner04 inner041 = new Outer04().new Inner04();

    }
}

class Outer04{
    private int n1 = 20;
    public String name = "张三";

    private void hi(){
        System.out.println("hi()...");
    }
    //注意：成员内部类，是定义在外部类的成员位置上
    //可以添加任意访问修饰符（public、protect、默认、private）,因为它的地位就是一个成员
    public class Inner04{
        public int n1 = 120;
        public void say(){
            //可以直接访问外部类的所有成员，包含私有的
            System.out.println("name = " + name);
            System.out.println("Inner04.n1 = " + n1 + "; Outer04.n1 = " + Outer04.this.n1);
            hi();
        }
    }

    public void t1(){
        //使用成员内部类
        //外部类 --- 访问 ----> 成员内部类【访问方式：创建对象，再访问】
        Inner04 inner04 = new Inner04();
        inner04.say();
        System.out.println(inner04.n1);
    }

    //该方法，返回一个成员内部类对象
    public Inner04 getInner04Instance(){
        return new Inner04();
    }
}