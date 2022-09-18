package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-17:50
 */
public class Bank {
    private Customer2[] customers; //存放多个客户
    private int numberOfCustomer; //记录实际操作的客户个数

    public Bank(){
        customers = new Customer2[10];
    }
    public void addCustomer(String f,String l){
        //添加客户
        Customer2 customer2 = new Customer2(f, l);
        customers[numberOfCustomer++] = customer2;
    }
    public int getNumberOfCustomerumbers(){
        //获取客户的个数
        return numberOfCustomer;
    }
    public Customer2 getCustomer(int index) {
        //获取指定下标的客户信息
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }
}