package com.xzz.day09;

/**
 * @author 徐正洲
 * @date 2022/5/11-19:24
 */
public class Account {
    private int id;
    private String pass ="000000";
    private double balance;
    private static double Rate;
    private static double minMoney=1.0;
    private static int initId=1000; //用于自动生成id

    public Account(){
        id =initId++;
    }

    public Account(String pass, double balance) {
        this();
        this.pass = pass;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return Rate;
    }

    public static void setRate(double rate) {
        Rate = rate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public static int getInitId() {
        return initId;
    }

    public static void setInitId(int initId) {
        Account.initId = initId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pass='" + pass + '\'' +
                ", balance=" + balance +
                '}';
    }
}