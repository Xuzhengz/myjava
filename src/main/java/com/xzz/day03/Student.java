package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/4-19:53
 */
public class Student extends Inherit {
    String major;

    public Student(){

    }

    public Student(String name, int age, String major) {
        this.major = major;
        eat();
        heart();
    }




}