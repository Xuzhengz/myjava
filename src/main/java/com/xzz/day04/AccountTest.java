package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/7-19:12
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1, 20000, 0.03);

        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        System.out.println(account.getBalance());
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(((double)account.getMonthlyInterest()) * 100 + "%");

    }
}