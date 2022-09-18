package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:16
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids(12);
        kids.printAge();
        kids.setSalary(0);
        kids.setSex(1);
        kids.manOrWoman();
        kids.employeed();
    }
}