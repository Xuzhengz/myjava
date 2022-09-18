package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/7-19:08
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //月利率
    public double getMonthlyInterest() {
        return this.annualInterestRate / 12;
    }

    //取钱
    public void withdraw(double amount) {
        if (balance > amount) {
            this.balance -= amount;
            return;
        }
        System.out.println("余额不足");

    }

    //存钱
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("存钱成功");
        }
    }

}