package com.xzz.project01;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author 徐正洲
 * @date 2022/5/19-9:14
 */
public class Review0519 {
    public static void main(String[] args) {
        boolean isFlag = true;
        String detail = "收支\t\t账号金额\t\t收支金额\t\t说明\n";
        int initMoney = 10000;
        while (isFlag) {
            System.out.println("---------------家庭收支记账软件---------------");
            System.out.println("               1 收支明细");
            System.out.println("               2 登记收入");
            System.out.println("               3 登记支出");
            System.out.println("               4 退出\n");
            System.out.print("               请选择(1-4)：");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("---------------当前收支明细记录---------------");
                    System.out.println(detail);
                    System.out.println("--------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String addInfo = Utility.readString();
                    initMoney += addMoney;
                    detail += "收入\t\t" + initMoney + "\t\t" + addMoney + "\t\t\t" + addInfo + "\n";
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int jMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String jInfo = Utility.readString();
                    if (initMoney < jMoney) {
                        System.out.println("账号余额不足");
                    } else {
                        initMoney -= jMoney;
                        detail += "支出\t\t" + initMoney + "\t\t" + jMoney + "\t\t\t" + jInfo + "\n";
                    }
                    break;
                case '4':
                    System.out.print("是否确认退出(Y/N):");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    return;
            }

        }
    }
}