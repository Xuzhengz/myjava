package com.xzz.day06;

/**
 * @author 徐正洲
 * @date 2022/5/8-19:21
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Circle yellow = new Circle("yellow", 1.0, 1.0);
        System.out.println(test.displayArea(yellow));
        Circle yellow1 = new Circle("yellow", 1.0, 1.0);
        System.out.println(test.displayArea(yellow1));
        System.out.println(test.equalArea(yellow1, yellow));

        MyRectangle blue = new MyRectangle("blue", 2, 3, 2);
        System.out.println(blue.findArea());
        System.out.println(test.equalArea(yellow1, blue));

    }

    public boolean equalArea(GeometricObject g1,GeometricObject g2){ //动态参数，可将子类对象作为参数传入父类的数据类型
        return g1.findArea() == g2.findArea();
    }
    public double displayArea(GeometricObject geometricObject){
        return geometricObject.findArea();
    }
}