package com.litchi.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("jackasdfsad", 3, "123");
        System.out.println(account.toString());
    }
}

class Account{
    private String username;
    private double balance;//余额
    private String password;

    public Account() {
    }

    public Account(String username, double balance, String password) {
        setUsername(username);
        setBalance(balance);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() > 4 || username.length() < 2){
            System.out.println("姓名长度需要在（2 - 4）之间，给默认名：无名小子");
            this.username = "无名小子";
        }else this.username = username;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <= 20){
            System.out.println("余额必须大于20，给默认值：21");
            this.balance = 21;
        }
        else this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() != 6){
            System.out.println("密码必须为6位，给默认密码：123456");
            this.password = "123456";
        }else this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}