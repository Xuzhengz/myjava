package com.xzz.myjava;

import com.sun.corba.se.impl.orbutil.ObjectStreamClass_1_3_1;

/**
 * @author 徐正洲
 * @date 2022/4/29-9:31
 *
 * 1、基本数据类型：此时赋值的是变量所保存的数据值。
 * 2、引用数据类型：此时赋值的变量所保存的数据的地址值。
 */
public class 面向对象上_值传递 {
    public static  void main(String[] args) {

//        基本数据类型值传递
/*        int m = 10;
        int n = m;
        System.out.println(m + "\t" + n);
        n =20;
        System.out.println(m + "\t" + n);*/

//        引用数据类型值传递
        Order order = new Order();
        order.o1 = 1001;
        Order o2 = order;
        System.out.println(order.o1 + "\t" + o2.o1);
        o2.o1=1002;   // o2与order使用一个堆地址值属性，所以修改了o1的值，order的值也会跟着改变
        System.out.println(order.o1 + "\t" + o2.o1);

    }

    static class Order {
        int o1;
    }


}