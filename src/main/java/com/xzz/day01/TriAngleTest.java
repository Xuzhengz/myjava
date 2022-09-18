package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:57
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(4, 3);
        int base = triAngle.getBase();
        int height = triAngle.getHeight();
        System.out.println("三角形面积为：" + (base * height) / 2);
    }
}