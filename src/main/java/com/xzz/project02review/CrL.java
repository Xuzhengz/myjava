package com.xzz.project02review;

/**
 * @author 徐正洲
 * @date 2022/5/19-10:04
 */
public class CrL {
    private Cr[] customers;          //用来保存客户对象的数组
    private static int total;        //记录已保存客户对象的数量

    public CrL(int totalCustomer){
        customers = new Cr[totalCustomer];
    }
    public boolean addCustomer(Cr customer){
        if (total > customers.length){
            return false;
        }else {
            customers[total++]=customer;
            return true;
        }
    }
    public boolean replaceCustomer(int index, Cr cust){
        if (index >= total || index <0){
            return false;
        }
        customers[index] = cust;
        return true;
    }
    public boolean deleteCustomer(int index){
        if (index > total || index <0){
            System.out.println("该客户不存在");
        }
        for (int i = 0; i < total; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total]=null;
        return true;
    }
    public Cr[] getAllCustomers(){
        Cr[] crs = new Cr[total];
        for (int i = 0; i < crs.length; i++) {
            crs[i] = customers[i];
        }
        return crs;
    }
    public Cr getCustomer(int index){
        if (index >= total || index <0){
            return null;
        }
        return customers[index];
    }
    public int getTotal(){
        return total;
    }
}