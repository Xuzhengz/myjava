package com.xzz.day12;

/**
 * @author 徐正洲
 * @date 2022/5/14-20:59
 *
 * jdk8 除了定义全局常量和抽象方法，还可以定义静态方法、默认方法
 */
public interface InterfaceJdk8 {
    public static void method1(){
        System.out.println("jdk8新增的静态方法");
    }
    public default void method2(){
        System.out.println("jdk8新增的默认方法");
    }
    default void method3(){
        System.out.println("jdk8新增的默认方法");
    }
}