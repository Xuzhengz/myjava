package com.xzz.day07;

/**
 * @author 徐正洲
 * @date 2022/5/9-9:39
 */
public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Circle white = new Circle("white", 2.0, 2.0);
        // 因为getColor方法返回值是string类型，所以equals方法比较的是实体内容
        System.out.println(circle.getColor().equals(white.getColor()));
        //重写的equals方法比较的是半径是否相同
        System.out.println(circle.equals(white));
        System.out.println(circle.toString());

    }
}