package com.litchi.debug_;

import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        //我想看看Arrays.sort方法底层实现，F7
        Arrays.sort(arr);
        for (int i: arr) {
            System.out.print(i + "\t");
        }
        System.out.println(100);
        System.out.println(700);
        System.out.println(700);
        System.out.println(600);
        System.out.println(500);
        System.out.println(400);
        System.out.println(300);
        System.out.println(200);
    }
}
