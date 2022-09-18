package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:23
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.1);
        cylinder.setLength(2);
        System.out.println(cylinder.findVolume());
    }
}