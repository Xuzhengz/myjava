package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/7-19:24
 */
public class CheckAccoutTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        System.out.println("余额：" + checkAccount.getBalance());
        System.out.println("可透支金额：" + checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("余额：" + checkAccount.getBalance());
        System.out.println("可透支金额：" + checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("余额：" + checkAccount.getBalance());
        System.out.println("可透支金额：" + checkAccount.getOverdraft());

    }
}