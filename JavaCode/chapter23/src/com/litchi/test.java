package com.litchi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 林志贤
 * @version 1.0
 */
public class test {
    static int n = 7;
    static int k = 3;
    static List<List<Integer>> res;

    public static void main(String[] args) {
        //输入n, k 返回[1, n]中的k个集合
        //思路分析
        // 1.获取输入
        // 2.定义集合，数量为k个、
        // 3.类似于遍历从1开始，第二个用2的情况，第三个用3；第2个用3的时候，第3个就得从4开始
        // 4.输出
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数n:");
//        int n = sc.nextInt();
//        System.out.println("请输入第二个数k:");
//        int k = sc.nextInt();
//        if (n < k) {
//            System.out.println("n 不能小于 k");
//            return;
//        }
//        System.out.println("n = " + n + ", k = " + k);
        res = new ArrayList<>();
        dfs(1, k, new LinkedList<>());
        for (List<Integer> re : res) {
            System.out.println(re);
        }

    }

    public static void dfs(int idx, int k, LinkedList<Integer> path) {
////        int t = 0;
////        int temp = 0;
////        ArrayList<Integer> list = new ArrayList<>();
////        for (int i = 1; i < n - k; i++) {
////            for (int j = i; j < k; j++) {
////                list.add(j);
////            }
////        }
////        System.out.println(list);
//        list.add(i);
//        if (num == k){
//            return 0;
//        }
//
//        return 1;
        if (k == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i <= n; i++) {
            path.add(i);
            dfs(i+1, k-1,path);
            path.removeLast();
        }
    }
}
