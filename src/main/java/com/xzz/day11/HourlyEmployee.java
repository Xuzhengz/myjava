package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-20:18
 */
public class HourlyEmployee extends Employee {
    private int hour;
    private int wage;

    public HourlyEmployee(String name, int number, MyDate birthday, int hour, int wage) {
        super(name, number, birthday);
        this.hour = hour;
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return hour * wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                '}';
    }
}