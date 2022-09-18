package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-20:18
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
//        System.out.println("月工资为：" + monthlySalary);
        return monthlySalary;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + super.toString();
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}