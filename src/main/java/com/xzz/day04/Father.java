package com.xzz.day04;

import sun.security.jca.GetInstance;

/**
 * @author 徐正洲
 * @date 2022/5/6-19:57
 */
public class Father {
    String name;
    int age;

    public Father() {
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep(int hours) {
        System.out.println("睡觉了" + hours + "小时");
    }
}