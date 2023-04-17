package com.litchi.stringbuffer_;

import java.util.Scanner;

/**
 * @author 林志贤
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "手机";
        System.out.println("请输入商品名：");
        name = sc.next();


        System.out.println("请输入商品价格：");
        String sal = sc.next();
        StringBuffer stringBuffer = new StringBuffer(sal);
//        int index = stringBuffer.indexOf(".");
//        int insertIndex = index;
//        int i = index/ 3;
//        for (int j = 0;j < i; j++){
//            insertIndex = insertIndex - 3;
//            stringBuffer.insert(insertIndex, ",");
//        }
        //化繁为简，先死后或 思路分析>走代码
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer.insert(i, ",");
        }
        String info = "商品名\t商品价格\n"
                + name + "\t\t" + stringBuffer;
        System.out.println(info);
    }
}
