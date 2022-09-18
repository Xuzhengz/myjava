package com.xzz.day12;

import org.omg.CORBA.INTERNAL;

/**
 * @author 徐正洲
 * @date 2022/5/14-19:37
 *
 * 接口
 * 1、接口和类的并列的两个结构
 * 2、如何定义接口、定义接口的成员
 *
 *      1）jdk7以前：只能定义全局常量和抽象方法
 *      全局常量：public static final  可省略
 *      抽象方法：public abstract void eat();
 *
 *
 *      2）jdk8 除了定义全局常量和抽象方法，还可以定义静态方法、默认方法
 *
 * 3、接口不可以定义构造器、不可以实例化
 * 4、类实现接口 implements
 *      如果实现类重写了接口中的所有抽象方法，则可以实例化
 *
 * 5、java类可以实现多接口--->弥补了只能继承一个直接父类
 *  格式：class Plane extends InterfaceTest implements Flyable,Flyable2
 *
 * 6、接口与类关系称为实现、接口与接口称为多继承、类和类称为继承。
 *
 * 抽象类和接口的异同？
 * 1）都不可以实例化
 * 2）接口不可以创建构造器
 *
 *
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
//        Flyable.MIN_SPEED =2; //常量不可修改

    }

}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED =7900;
    int MIN_SPEED=1;   //省略了public static final

    //抽象方法
    public abstract void eat();
    void setMaxSpeed(); //省略public abstract

//    不可以创建构造器
//    public Flyable(){
//
//    }

}
interface Flyable2{
    void show();
}
interface Flyable3{
    void show();
}

class Plane extends InterfaceTest implements Flyable,Flyable2,Flyable3{

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void setMaxSpeed() {
        System.out.println("设置一下最大速度拉！！！");
    }


    @Override
    public void show() {

    }
}