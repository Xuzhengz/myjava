package com.xzz.day05;

import java.util.Date;

/**
 * @author 徐正洲
 * @date 2022/5/7-19:38
 *
 * 面向对象特征之三：特征性
 *
 * 理解：一个事物的多种形态。
 * 多态性：父类的引用指向子类的对象
 * 使用：1）当调用重写的方法后，实际调用的是子类重写后的方法---虚拟方法调用
 *      2）子类特有的方法不能使用，只能调用父类中声明的方法，但实际运行的是子类的重写的方法
 *      3）编译看左边，运行看右边。
 *      4）如果想要使用子类特有的方法，需要使用强转符号 强转类型 变量  =(强转的类型)原对象
 *
 *      特别：属性不适用于多态性
 *
 * 使用前提：1）具有继承关系
 *         2）方法重写
 *
 *         重载与重写：
 *         重载在编译时已确定；
 *         重写在运行时在确定。
 *
 *
 * instanceof
 * 1）使用： a instanceof A ： 判断对象a是否是类A的实例化，如果是 返回true
 * 2）为了避免在向下转型时出现异常，通常使用instancof 进行判断
 * 3）对象a 使用instanceof A的父类或者Object类 也返回true
 */
public class PersonTest {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.eat();
//
//        Man man = new Man();
//        man.eat();
//        man.earnMoney();


        //*************************
//        多态性   父类的引用指向子类的对象
        Person person2 = new Man();
//        person2.eat();
        //子类特有的方法不能执行
//        person2.earnMoney();

        System.out.println("***************************");

        //有了对象的多态性之后，由于定义的是父类引用数据类型，所以无法获取子类对象中的方法和属性。
        //编译时，只能使用父类声明的属性和方法。

        //如何调用子类的属性和方法？
//        Man man1 = (Man)person2;
//        man1.earnMoney();
//        man1.isSmoking =true;
//
//        if (person2 instanceof Man){
//            System.out.println("true");
//        }


//        练习：
//        问题一：编译时通过，运行时不通过
//        Person women = new Women();
//        Man man = (Man)women;
//        man.isSmoking=false;
//        举例二
//        Person p3 = new Person();
//        Man man =(Man)p3;
//        man.earnMoney();

//        问题二：编译时通过，运行时通过

//        Object object = new Women();
//        Person person1 = (Person)object;
//        person1.eat();

//        编译不过
//        Man man = new Women();
//        String date = new Date();

//        if (person2 instanceof Man){
//            System.out.println(true);
//        }
//
//        Man man =(Man)person2;
//        man.eat();
//        ((Man) person2).earnMoney();


    }
}