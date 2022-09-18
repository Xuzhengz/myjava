package com.xzz.project02review;

import com.xzz.project01.Utility;
import com.xzz.project02.CMUtility;
import com.xzz.project02.Customer;

/**
 * @author 徐正洲
 * @date 2022/5/19-10:20
 */
public class CView {
    CrL crL = new CrL(10);

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n---------------客户信息管理软件---------------");
            System.out.println("               1 添 加 客 户");
            System.out.println("               2 修 改 客 户");
            System.out.println("               3 删 除 客 户");
            System.out.println("               4 客 户 列 表");
            System.out.println("               5 退      出");
            System.out.print("               请选择(1-5)：");
            char selection = CUtility.readMenuSelection();
            switch (selection) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("是否确认退出(Y/N):");
                    char isExit = CUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    return;
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CUtility.readString(10);
        System.out.print("性别：");
        char sex = CUtility.readChar();
        Cr cr = new Cr(name, sex);
        boolean addRuselt = crL.addCustomer(cr);
        if (addRuselt) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------添加失败---------------------");
        }

    }

    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int num;
        Cr cr;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            num = CUtility.readInt();
            if (num == -1) {
                return;
            }
            cr = crL.getCustomer(num - 1);
            if (cr == null) {
                System.out.println("没有此客户信息");
            } else {
                break;
            }
        }
        System.out.print("姓名(" + cr.getName() + ")");
        String name = CUtility.readString(10, cr.getName());
        System.out.print("姓名(" + cr.getGender() + ")");
        char sex = CUtility.readChar(cr.getGender());
        Cr cr1 = new Cr(name, sex);
        boolean replaceCustomerResult = crL.replaceCustomer(num - 1, cr1);
        if (replaceCustomerResult){
            System.out.println("---------------------修改完成---------------------");
        }else {
            System.out.println("---------------------修改失败---------------------");
        }

    }

    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int id;
        Cr cr;
        for (; ; ) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            id = CUtility.readInt();
            if (id == -1) {
                return;
            }
            cr = crL.getCustomer(id - 1);
            if (cr == null) {
                System.out.println("没有此客户信息");
            } else {
                break;
            }
        }
        System.out.print("是否确认要删除(Y/N)：");
        char isDelete = CUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean result = crL.deleteCustomer(id - 1);
            if (result) {
                System.out.println("-----------删除成功-----------");
            }
        } else {
            return;
        }


    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        if (crL.getTotal() == 0) {
            System.out.println("暂无客户信息");
        } else {
            System.out.println("编号\t姓名\t\t性别");
            Cr[] allCustomers = crL.getAllCustomers();
            for (int i = 0; i < allCustomers.length; i++) {
                System.out.println((i + 1) + "\t" + allCustomers[i].getName() + "\t" + allCustomers[i].getGender());
            }
        }
        System.out.println("---------------------------客户列表完成---------------------------");

    }

    public static void main(String[] args) {
        CView cView = new CView();
        cView.enterMainMenu();
    }

}