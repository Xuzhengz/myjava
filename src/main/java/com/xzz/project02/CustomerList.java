package com.xzz.project02;

/**
 * @author 徐正洲
 * @date 2022/5/3-19:13
 * <p>
 * CustomerList为控制层，管理Customer对象模块
 * 1、内部使用数组管理一组Customer对象、并提供相应的添加、修改、删除和遍历方法给CustomerView使用
 */
public class CustomerList {
    //属性
    private Customer[] customers;       //保存客户对象的数组
    private int totalCustomerNumber = 0;    //实际客户的总个数

    //构造器
//    1)记录客户数组的长度
    public CustomerList(){

    }
    public CustomerList(int length) {
        customers = new Customer[length];
    }

    //    2）增
    public boolean addCustomer(Customer customer) {
        if (totalCustomerNumber > customers.length) {
            return false;
        } else {
            customers[totalCustomerNumber++] = customer;
            return true;
        }
    }

    //    3）删
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= totalCustomerNumber) {
            return false;
        }
        for (int i = index; i < totalCustomerNumber; i++) {
            customers[i] = customers[i + 1];
        }
        //最后有数据的元素需要设置为null
        customers[--totalCustomerNumber] = null;
        return true;
    }

    //    4）改
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= totalCustomerNumber) {
            return false;
        }
        customers[index] = customer;
        return true;
    }

    //    5）获取所有客户信息
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[totalCustomerNumber];
        for (int i = 0; i < totalCustomerNumber; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    //    6）获取指定位置的客户信息
    public Customer getCustomer(int index) {
        if (index < 0 || index >= totalCustomerNumber) {
            return null;
        }
        return customers[index];
    }

    //    7）获取客户总数
    public int getTotal() {
        return totalCustomerNumber;
    }
}