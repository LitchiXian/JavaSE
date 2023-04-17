package com.litchi.math_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        //看看Math 常用的方法(静态方法)
        //1.abs 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);//9
        //2.pow 求幂
        double pow = Math.pow(2, 4);//2的4次方
        System.out.println(pow);//16.0
        //3.ceil 向上取整，返回 >= 该参数的最小整数
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);//-3.0
        //4.floor 向下取整，返回 <= 该参数的最大整数
        double floor = Math.floor(-4.999);
        System.out.println(floor);//-5.0
        //5.round 四舍五入 Math.floor(该参数 + 0.5)
        long round = Math.round(5.51);
        System.out.println(round);//6
        //6.sqrt 求开方
        double sqrt = Math.sqrt(16);
        System.out.println(sqrt);//4.0
        //7.random 求随机数
        //  random 返回的是 0 - 1 之间的随机小数
        //  思考：请写出获取 a - b 之间的一个随机整数
        //  1.获取随机数
        //  2.判断值是否在某个区间,是则返回
//        double ran;
//        while (true) {
//            ran = Math.floor(Math.random() * 100);
//            if (ran <= 7 && ran >= 2) break;
//        }
//        System.out.println(ran);
        //有浪费资源
        //看看老韩思路
        // (int)(a) <= x <= (int)(a + Math.random() * (b - a + 1))
        int i = (int) (2 + Math.random() * 6);
        System.out.println(i);

        //max,min 求最大值，最小值
        int max = Math.max(12, 40);
        int min = Math.min(123, 9);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
