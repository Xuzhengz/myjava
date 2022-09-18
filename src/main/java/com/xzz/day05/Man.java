package com.xzz.day05;

/**
 * @author 徐正洲
 * @date 2022/5/7-19:35
 */
public class Man extends Person {
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("赚钱");
    }

    @Override
    public void eat() {
        System.out.println("多吃饭");
    }
}