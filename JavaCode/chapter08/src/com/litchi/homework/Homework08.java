package com.litchi.homework;

public class Homework08 {
    public static void main(String[] args) {
        BankAccount bankAccount;
        bankAccount = new BankAccount(3000);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        System.out.println("============");
        bankAccount = new CheckingAccount(3000);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        System.out.println("============");
        bankAccount = new SavingAccount(3000);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
        SavingAccount s = (SavingAccount) bankAccount;
        s.earnMonthlyInterest();
        System.out.println(s.getBalance());
        s.withdraw(100);
        System.out.println(s.getBalance());
    }
}

class BankAccount {
    private double balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}

class SavingAccount extends BankAccount {
    private int number = 3;

    static final double interest = 0.01;

    public SavingAccount(int balance) {
        super(balance);
    }

    public void earnMonthlyInterest() {
        setBalance(getBalance() * (1 - interest));
        number = 3;
    }

    @Override
    public void deposit(double amount) {
        if (number <= 0)
            super.deposit(amount - 1);
        else {
            number--;
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (number <= 0)
            super.withdraw(amount + 1);
        else {
            number--;
            super.withdraw(amount);
        }
    }
}