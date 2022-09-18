package com.xzz.day04;


/**
 * @author 徐正洲
 * @date 2022/5/7-19:15
 */
public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
//            setBalance(getBalance() - amount);
            super.withdraw(amount);
        } else if (overdraft >= amount - getBalance()) {
            overdraft -= amount - getBalance();
            setBalance(0);
        }else {
            System.out.println("超过可透支余额");
        }
    }
}