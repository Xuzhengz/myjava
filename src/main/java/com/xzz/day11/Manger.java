package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-19:43
 */
public class Manger extends Employeeooo {
    private double bonus;
    @Override
    public void work() {
        System.out.println("主管");
    }

    public Manger(double bonus) {
        this.bonus = bonus;
    }

    public Manger(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}