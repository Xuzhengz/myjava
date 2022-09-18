package com.xzz.day18;

/**
 * @author 徐正洲
 * @date 2022/5/23-19:54
 *
 * // 将单例-懒汉式 改写为线程安全
 *
 */
public class BankTest {
}
class Bank{
    private Bank(){

    }

    private static Bank bank = null;

    public  static Bank getInstance(){
        //效率更高
        if(bank == null){
            synchronized(Bank.class){
                if (bank==null){
                    bank=new Bank();
                }
            }
        }
        return bank;
    }
}