package com.xzz.day09;

/**
 * @author 徐正洲
 * @date 2022/5/11-19:24
 */
public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account();
        Account account1 = new Account("123", 1000);
        System.out.println(account.getId());
        System.out.println(account1.getId());

        System.out.println(account);
        System.out.println(account1);
    }
}