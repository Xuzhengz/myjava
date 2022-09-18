package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/6-20:41
 */
public class SuperSub extends Super {
    String major;
    int id=1002;

    public SuperSub(String major) {

    }

    @Override
    public void eat() {
        System.out.println("多吃点饭");
    }

    public void study() {
        System.out.println("学习知识");
    }

    public void show() {
        super.eat();
        System.out.println("name:" + name + "\t" + age);
        System.out.println(super.id);
    }
}