package com.xzz.day12;

/**
 * @author 徐正洲
 * @date 2022/5/14-20:52
 */
public class ComparableTest {
    public static void main(String[] args) {
        CompareToCircle compareToCircle = new CompareToCircle(3.12);
        CompareToCircle compareToCircle1 = new CompareToCircle(3.5);
        System.out.println(compareToCircle.CompareTo(compareToCircle1));
    }
}