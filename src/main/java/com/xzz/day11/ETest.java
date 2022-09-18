package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-19:44
 */
public class ETest {
    public static void main(String[] args) {
        //多态
        Employeeooo xx = new Manger("xx", 1, 20000, 10000);
        xx.work();

        CommonE commonE = new CommonE();
        commonE.work();

    }
}