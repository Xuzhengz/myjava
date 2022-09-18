package com.xzz.project01;

/**
 * @author 徐正洲
 * @date 2022/4/21-9:13
 */
public class FamilyAccountDetail {
    public static void main(String[] args) {
        boolean isFlag =true;
        int initMoney =10000;
        String detail = "收支\t\t" +"账号金额\t\t" + "收支金额\t\t"+"说明\n";

        while (isFlag){
//            1、界面框架
            System.out.println("---------------家庭收支记账软件---------------\n");
            System.out.println("                1 收支明细");
            System.out.println("                2 登记收入");
            System.out.println("                3 登记支出");
            System.out.println("                4 退出\n");
            System.out.print("                请选择(1-4)：");
//            2、读取用户选项
            char selection = Utility.readMenuSelection();

            switch (selection){
//                1）收支明细
                case '1':
                    System.out.println("---------------当前收支明细记录---------------");
                    System.out.println(detail);
                    System.out.println("--------------------------------------------\n");
                    break;
//                2）登记收入
                case '2':
                    System.out.print("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String addInfo = Utility.readString();
                    initMoney+=addMoney;
                    detail+="收入\t\t" + initMoney + "\t\t" + addMoney + "\t\t" + addInfo +"\n" ;
                    System.out.println("登记成功");
                    break;
//                3）登记支出
                case '3':
                    System.out.print("本次支出金额：");
                    int reduceMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String reduceInfo = Utility.readString();
                    if (initMoney >= reduceMoney){
                        initMoney-=reduceMoney;
                        detail+="收入\t\t" + reduceMoney + "\t\t" + reduceMoney + "\t\t" + reduceInfo +"\n" ;
                        System.out.println("登记成功");
                    }else {
                        System.out.println("超额，登记不上。");
                    }

                    break;
//                4）退出
                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExist = Utility.readConfirmSelection();
                    if (isExist == 'Y'){
                        isFlag = false;
                    }else {
                        break;
                    }
            }
        }
    }
}