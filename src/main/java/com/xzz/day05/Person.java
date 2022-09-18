package com.xzz.day05;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:27
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}