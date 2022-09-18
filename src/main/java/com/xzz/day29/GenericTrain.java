package com.xzz.day29;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/6/5-20:00
 * <p>
 * 自定义泛型类：
 */
public class GenericTrain {
    @Test
    public void test() {
        //建议在实例化时要指明类的泛型
        Exer1<Integer> objectExer1 = new Exer1<>();
        objectExer1.orderT = 123;
        System.out.println(objectExer1.orderT);

        SubExer<String> stringSubExer = new SubExer<>();

    }
}