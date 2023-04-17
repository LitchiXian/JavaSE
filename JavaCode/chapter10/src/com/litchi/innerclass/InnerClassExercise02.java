package com.litchi.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //传递的是实现了 Bell接口的匿名内部类
        //重写了 ring
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了....");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙子上课了....");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}