package com.xzz.myjava;

/**
 * @author 徐正洲
 * @date 2022/4/28-20:24
 * <p>
 * 方法的重载(reload)
 * 1、在同一个类中，允许定义一个以上的同名方法，只要他们的参数的个数或者参数类型不同即可
 * <p>
 * "两同一不同"：同一个类，相同方法名。   参数列表不同，参数类型不同。
 * 2、例如arrays工具类中的方法
 * <p>
 * 3、判断是否是重载
 * 跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系。
 * <p>
 * 4、在通过对象调用方法时，如何确定某一个指定的方法
 * 1）方法名  2）参数列表
 */
public class 面向对象上_方法 {
    public static void main(String[] args) {
        面向对象上_方法 method = new 面向对象上_方法();
        method.mOl(3);
        method.mOl("hah");
        method.mOl(3, 5);
        System.out.println(method.max(1.1, 1.2, 1.3));


    }

    public void mOl(int i) {
        System.out.println(i * i);
    }

    public void mOl(int i, int j) {
        System.out.println(i + j);
    }

    public void mOl(String i) {
        System.out.println(i);
    }

    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j, double o) {
        double max = (i > j) ? i : j;
        return (max > o) ? max : o;
    }


}