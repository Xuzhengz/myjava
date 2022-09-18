package com.xzz.day36;

import com.xzz.day23.MyAnnovation;

import java.io.Serializable;

/**
 * @author 徐正洲
 * @date 2022/6/11-15:59
 */
@MyAnnovation
public class Person extends Ceatrue<Integer> implements Serializable {

    //定义序列化号，用于传输识别
    private static final long serialVersionUID = -6849721470754667710L;

    private String name;
    private int age;
    public int sex;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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
    @MyAnnovation
    private void show(){
        System.out.println("我是徐正洲，只能使用反射调用我。");
    }
    @MyAnnovation(value = "鸡翅")
    public void eat(String food) throws Exception{
        System.out.println("我在吃："+ food);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}