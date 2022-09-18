package com.xzz.day12;

/**
 * @author 徐正洲
 * @date 2022/5/14-21:03
 */
public class Sub implements InterfaceJdk8 {
    public static void main(String[] args) {
        Sub sub = new Sub();
//        sub.method1();
//        知识点1、接口定义的静态方法，只能通过接口调用
        InterfaceJdk8.method1();
//        知识点2、如果实现类重写了接口的方法，仍然调用的是重写的方法
        sub.method2();
//        知识点3、如果子类或者实现类继承的父类和实现的接口中声明了同样的方法、当没有重写的情况下，默认是父类的方法
    }

    @Override
    public void method2() {
        System.out.println("重写");
    }
    public void myMethod(){
        //调用接口的默认static方法
        InterfaceJdk8.super.method3();
    }
}