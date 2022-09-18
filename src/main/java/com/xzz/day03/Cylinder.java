package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:21
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //    返回圆柱的体积
    public double findVolume() {
//        return Math.PI * getRadius() * getRadius() * this.length;

        return super.findArea() * getLength();
    }

    @Override
    public double findArea() {//重写findArea方法 返回圆柱的表面积
        return Math.PI * getRadius() * getRadius() * 2 + Math.PI * getRadius() * this.length * 2;


    }
}