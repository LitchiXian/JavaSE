package com.litchi;

/**
 * @author 林志贤
 * @version 1.0
 */
public class CPUNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量/核心数
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前cpu有 " + cpuNums + " 个");
        //也有叫 8 核
    }
}
