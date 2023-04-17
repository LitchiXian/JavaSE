package com.litchi.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        //我想看看Arrays.sort方法底层实现，F7
        Arrays.sort(arr);
        for (int i: arr) {
            System.out.print(i + "\t");
        }
    }
}
