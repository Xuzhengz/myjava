package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/4-19:53
 */
public class Inherit extends Creature {
    private String name;
    private int age;

    public Inherit() {
    }

    public Inherit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}