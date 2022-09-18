package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/6-19:58
 */
public class Person extends Father {
    String major;

    public Person() {
    }

    public Person(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习" + major);
    }
    //对父类的eat方法进行了复写
    @Override
    public void eat() {
        System.out.println("多吃点有营养的东西");
    }

}