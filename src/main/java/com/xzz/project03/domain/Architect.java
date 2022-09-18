package com.xzz.project03.domain;

/**
 * @author 徐正洲
 * @date 2022/5/18-10:10
 */
public class Architect extends Designer {
    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        //获取间接父类的tostring方法
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    public String getDetailForTeam() {
        return getMemberId() + "/t" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "架构师" + "\t" + getBonus() + "\t" + getStock();
    }
}