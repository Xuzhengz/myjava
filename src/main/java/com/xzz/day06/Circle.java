package com.xzz.day06;

/**
 * @author 徐正洲
 * @date 2022/5/8-19:17
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}