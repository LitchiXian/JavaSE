package com.litchi.abstract_;

abstract public class Template {//抽象类-模板类
    public abstract void job();//抽象方法

    public void calculateTime(){//实现方法，调用job方法
        long start = System.currentTimeMillis();
        job();//动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 = " + (end - start));
    }
}
