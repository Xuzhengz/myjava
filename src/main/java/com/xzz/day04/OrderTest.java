package com.xzz.day04;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author 徐正洲
 * @date 2022/5/6-20:30
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
      //  order.orderPrivate=1;//跨类无法调用
        order.order=0;
        order.orderProtected=1;
        order.orderPublic=2;
    }
}