package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-18:11
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
        Customer2 customer = bank.getCustomer(0);
        customer.setAccount(new Account2(2000));
        customer.getAccount().withdraw(500);
        bank.addCustomer("Jane1", "Smith1");
        System.out.println("当前银行的客户个数为：" + bank.getNumberOfCustomerumbers());
    }
}