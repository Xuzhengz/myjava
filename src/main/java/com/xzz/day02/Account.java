package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-17:18
 */
public class Account {
    //属性
    private int id; //账号
    private double balance; //余额
    private double annualInterestRate; //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account() {
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

    public void withdraw(double amount) {
        //取钱
        if (this.balance >= amount) {
            balance -= amount;
            System.out.println("恭喜您取款成功,取款金额为：" + amount + "\t当前账号剩余：" + this.balance);
        } else {
            System.out.println("余额不足，取款失败");
            return;
        }
    }

    public void deposit(double amount) {
        //存钱
        if (amount > 0) {
            System.out.println("成功存入：" + amount);
        }
    }

}