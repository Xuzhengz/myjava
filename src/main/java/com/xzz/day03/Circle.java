package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:19
 */
public class Circle {
    private double radius;//半径

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //返回圆的面积
    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }
}