package com.xzz.day34;

import java.io.Serializable;

/**
 * @author 徐正洲
 * @date 2022/6/11-15:59
 */
public class Person implements Serializable {

    //定义序列化号，用于传输识别
    private static final long serialVersionUID = -6849721470754667710L;

    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}