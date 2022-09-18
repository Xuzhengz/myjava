package com.xzz.day11;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * @author 徐正洲
 * @date 2022/5/13-20:36
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入本月月份：");
        int month = scanner.nextInt();
        Employee[] employees = new Employee[2];
        //Employee不能实例，但是可以使用多态性。
        employees[0] = new SalariedEmployee("x",1,new MyDate(2000,12,07),9800);
        employees[1] = new HourlyEmployee("x",2,new MyDate(2001,11,07),160,50);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            double earnings = employees[i].earnings();
            System.out.println("月工资为：" + earnings);
            if (month == employees[i].getBirthday().getMonth()){
                earnings+=100;
                System.out.println("恭喜增加工资100元");
                System.out.println("当前工资为：" + earnings);
            }
        }
    }
}