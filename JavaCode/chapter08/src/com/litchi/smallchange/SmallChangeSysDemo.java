package com.litchi.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysDemo {
    String details = "-----------------------零钱通明细-----------------------";
    double balance = 0;

    boolean loop = true;
    //可以用于日期的格式化
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner sc = new Scanner(System.in);


    public void menu() {
        String key = "";
        do {
            System.out.println("=======================零钱通菜单=======================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择(1 - 4):");
            key = sc.next();
            switch (key) {
                case "1":
                    show();
                    break;
                case "2":
                    input();
                    break;
                case "3":
                    output();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("请输入正确选项(1 - 4):");
            }
        } while (loop);
    }

    public void show() {
        System.out.println(details);
    }

    public void input() {
        System.out.println("-----------------------收益 入账-----------------------");
        System.out.println("\t收益入账金额:");
        double money = sc.nextDouble();
        if (money <= 0) {
            System.out.println("请输入正确金额");
            return;
        }
        balance += money;
        details += "\n收益入账\t+" + money + "\t" + sdf.format(new Date()) + "\t余额: " + balance;
    }

    public void output() {
        System.out.println("----------------------- 消 费 -----------------------");
        System.out.println("\t消费说明:");
        String note = sc.next();
        System.out.println("\t消费金额:");
        double money = sc.nextDouble();
        if (money <= 0) {
            System.out.println("请输入正确金额");
            return;
        } else if (money > balance) {
            System.out.println("余额不足");
            return;
        }
        balance -= money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(new Date()) + "\t余额: " + balance;
    }

    public void exit() {
        //1.定义一个变量choice，接收用户输入
        //2.使用循环，接收到输入为 y 或者 n
        //3.退出循环，再判断是y还是n
//        2.3. 比 直接在循环里判断y，n好很多
//        建议一段代码，完成一个小功能，尽量不要混在一起
        //4.退出方法
        char key;

        do {
            System.out.println("是否退出 y/n ?");
            key = sc.next().charAt(0);
            if (key == 'y' || key == 'n')
                break;
        } while (true);

        if (key == 'y')
            loop = false;
    }
}
