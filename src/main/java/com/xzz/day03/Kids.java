package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:11
 */
public class Kids extends ManKind{
    //属性
    private int yearsOld;

    //构造器
    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    //方法
    public void printAge(){
        System.out.println(yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void employeed() {
        System.out.println("kid should study");
    }
}