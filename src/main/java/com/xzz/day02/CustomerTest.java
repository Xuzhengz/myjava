package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-17:29
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000, 1.23);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        System.out.println("客户为：" + customer.getFirstName() + customer.getLastName() + "\t银行账号为：" + account.getId() + "\t年利率为：" + account.getAnnualInterestRate());

    }
}