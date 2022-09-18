package com.xzz.project03.domain;

import com.xzz.project03.service.Status;

/**
 * @author 徐正洲
 * @date 2022/5/18-10:05
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }




    @Override
    public String toString() {
        //获取间接父类的tostring方法
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }

    public String getDetailForTeam() {
        return getMemberId() + "/t" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "设计师" + "\t" +getBonus();
    }
}