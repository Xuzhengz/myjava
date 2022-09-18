package com.xzz.day09;

import com.xzz.day02.Bank;

/**
 * @author 徐正洲
 * @date 2022/5/11-19:37
 * 单例设计模式
 * 1）只能存在一个对象实例
 *
 * 如何实现：
 * 2）构造器访问权限伟private
 * 3）调用该类的某个静态方法
 * 4）该类对象的变量也必须定义为静态
 *
 *
 * 区分饿汉式、懒汉式
 * 1）懒汉式好处：延迟对象的创建、饿汉式：对象加载时间过长
 * 2）饿汉式：线程安全。懒汉式：线程不安全。
 */
// 饿汉式
public class Singleton1 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        System.out.println(instance.toString());
    }
//    构造器访问权限伟private
    private Singleton1(){

    }

//    内部创建类的对象，必须是静态的
    private static Singleton1 instance = new Singleton1();

//    提供公共静态方法调用类的对象
    public static Singleton1 getInstance(){
        return instance;
    }
}