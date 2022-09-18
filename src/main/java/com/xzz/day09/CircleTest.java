package com.xzz.day09;

/**
 * @author 徐正洲
 * @date 2022/5/11-19:10
 *
 * Static应用
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getId());
        Circle circle1 = new Circle();
        System.out.println(circle1.getId());
        System.out.println(Circle.getTotal());


    }

}
class Circle{
    private double radius;
    private int id;

    public Circle(){
        id=init++;
        total++;
    }
    private static int total;      // 圆的个数
    private static int init=1001;  // 被所有对象共享

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }
}