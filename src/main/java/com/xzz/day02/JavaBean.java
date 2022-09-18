package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-16:20
 * JavaBean特征：
 * 1、空参构造器
 * 2、公共类
 * 3、提供set和get方法
 */
public class JavaBean {
    //私有属性
    private String name;
    private int age;
    //空参构造器
    public JavaBean() {
    }
    //提供set和get方法
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
}