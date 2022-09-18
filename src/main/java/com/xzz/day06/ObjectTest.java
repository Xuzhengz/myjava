package com.xzz.day06;

import com.xzz.day04.Order;

/**
 * @author 徐正洲
 * @date 2022/5/8-19:34
 *
 * 1)Object类是所有java类的父类
 * 2)Object只定义了一个空参构造器。
 * 3) equals() toString() getClass() hashCode()
 * 特别：当对象被回收之前，系统会调用finalize方法。
 *
 * 面试题：
 * final、finally、finalize的区别？
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        //Object
        System.out.println(order.getClass().getSuperclass());
        System.out.println(order.hashCode());
        System.out.println(order.toString());

    }
    static class Order{

    }
}
