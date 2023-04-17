package com.litchi.smallchangedemo;

import java.util.Date;
import java.util.Scanner;

public class Lingqiantongweb {
    Lingqiantong lingqiantong = new Lingqiantong();
    Scanner sc = new Scanner(System.in);


    public void mainnu(){

        do {
            System.out.println("-------------------零钱通菜单-------------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益 入账");
            System.out.println("\t\t\t3  消   费");
            System.out.println("\t\t\t4  退   出");
            System.out.println("请选择(1 - 4):");
            int next = sc.nextInt();
            switch (next) {
                case 1: show();
                break;
                case 2: input();
                break;
                case 3: output();
                break;
                case 4: return;
                default:
                    System.out.println("请输入正确选项(1 - 4):");
            }
        }while (true);
    }

    public void show(){
        System.out.println("-------------------零钱通明细-------------------");
        System.out.println(lingqiantong.getBalance());
    }

    public void input(){
        System.out.println("-------------------收益入账-------------------");
        System.out.println("\t请输入收益金额:");
        double fee = sc.nextDouble();
        if (fee <= 0){
            System.out.println("请输入正确金额");
            return;
        }
        lingqiantong.setMoney(lingqiantong.getMoney() + fee);
        lingqiantong.setBalance(lingqiantong.getBalance() + "\n收益入账\t+" + fee + "\t" + new Date() + "\t余额: " + lingqiantong.getMoney());
    }

    public void output(){
        System.out.println("-------------------消费-------------------");
        System.out.println("\t请输入消费地点:");
        String name = sc.next();
        System.out.println("\t请输入消费金额:");
        double fee = sc.nextDouble();
        if (fee <= 0){
            System.out.println("请输入正确金额");
            return;
        } else if (fee > lingqiantong.getMoney()) {
            System.out.println("余额不足");
            return;
        }
        lingqiantong.setMoney(lingqiantong.getMoney() - fee);
        lingqiantong.setBalance(lingqiantong.getBalance() + "\n收益入账\t-" + fee + "\t" + new Date() + "\t余额: " + lingqiantong.getMoney());
    }


}
