package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-17:18
 */
public class Account2 {
    //属性
    private double balance; //余额
    private double annualInterestRate; //年利率

    public Account2(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
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