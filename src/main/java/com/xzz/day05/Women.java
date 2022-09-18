package com.xzz.day05;

/**
 * @author 徐正洲
 * @date 2022/5/7-19:36
 */
public class Women extends Person {
    boolean isBeauty;

    public void goShopping(){
        System.out.println("花钱，购物");
    }

    @Override
    public void eat() {
        System.out.println("吃好多美食");
    }
}