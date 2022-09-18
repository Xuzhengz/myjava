package com.xzz.day09;

/**
 * @author 徐正洲
 * @date 2022/5/11-20:20
 *
 * 代码块（初始快）：
 *
 * 1）作用：用来初始化类、对象
 * 2）静态代码块、非静态代码块
 *
 * 3)区别：
 * 静态代码块(可多写，按照声明顺序执行)：
 *              1）随着类的加载而只执行一次。
 *              2）执行优先于非静态代码块
 *
 * 非静态代码块：
 *              1）随着对象的创建而执行，每创建一次就执行一次。
 *              2）给对象的属性初始化
 */
public class Block {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person person = new Person();

    }
}

class Person{
    //属性
    String name;
    int age;
    static String desc ="坚持、徐正洲";
    //构造器
    public Person(){

    }

    public Person(int age){
        this.age=age;
    }
    //代码块
    static {
        System.out.println("静态代码块");

    }

    {
        System.out.println("非静态代码块");
    }
    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}