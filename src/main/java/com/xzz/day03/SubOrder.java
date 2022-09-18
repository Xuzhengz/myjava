package com.xzz.day03;

import com.xzz.day04.Order;

/**
 * @author 徐正洲
 * @date 2022/5/6-20:31
 */
public class SubOrder extends Order {
    public static void main(String[] args) {
        SubOrder subOrder = new SubOrder();
        subOrder.orderProtected=1;//跨包的子类可以使用父类的protected属性
        subOrder.orderPublic=2;

/*      default 、private属性 跨包无法使用
        subOrder.order=2;
        subOrder.orderPrivate=3;*/

    }
}