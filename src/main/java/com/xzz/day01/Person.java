package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:27
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public int setAge(int i) {
        if (i < 0 || i > 130) {
            System.out.println("输入的年龄不合法！！！");
        }
        age = i;
        return i;
    }
}