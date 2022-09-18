package com.xzz.myjava;

import java.util.Date;

/**
 * @author 徐正洲
 * @date 2022/4/29-9:31
 * <p>
 * 1、形参：方法定义时，声明小括号内的参数
 * 2、实参：方法调用时，实际传递给形参的值。
 * <p>
 * 3、值传递机制
 * 如果参数基本数据类型：此时实参赋给形参的是实参真实存储的数据值。
 * 如果参数引用数据类型：此时实参赋给形参的是实参存储数据的地址值。
 */
public class 面向对象上_方法形参传递值 {
    public static void main(String[] args) {

//        Data data = new Data();
//        data.m = 10;
//        data.n = 20;
//        System.out.println(data.m + "\t" + data.n);
//
//        //交换m和n的值
//        面向对象上_方法形参传递值 methodVauleTransfer = new 面向对象上_方法形参传递值();
//        methodVauleTransfer.swap(data);
//        System.out.println(data.m + "\t" + data.n);

        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.pringAreas(circle, 5);
        System.out.println("当前的半径为：" + (int) circle.radius);


    }

    static class Data {
        int m;
        int n;
    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

    static class Circle {
        double radius;

        public double findArea() {
            return Math.PI * radius * radius;
        }
    }

    static class PassObject {
        public void pringAreas(Circle c, int time) {
            System.out.println("radius"+"\t\t\t\t"+"Area");
            for (int i = 1; i <= time; i++) {
                c.radius = i;
                System.out.print("当前半径为：" + i +"\t\t\t");
                System.out.println("圆的面积为：" + c.findArea());
            }
        }
    }
}