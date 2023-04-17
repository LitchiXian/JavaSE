package com.litchi.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        //instanceOf 比较操作符，用于判断对象的运行类型是否为 XX 类型或 XX 类型的子类型
        BB bb = new BB();
        System.out.println(bb instanceof AA);
        System.out.println(bb instanceof BB);
//        System.out.println(bb instanceof CC);//直接报错了
        //aa 编译类型是 AA，运行类型是 BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
        //说明看的是 aa的运行类型是否为 xx类型或xx的子类型

        AA aa2 = new AA();
        System.out.println(aa2 instanceof AA);
        System.out.println(aa2 instanceof BB);
    }
}

class AA {
}

class BB extends AA {
}

class CC {
}
