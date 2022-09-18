package com.xzz.day03;

/**
 * @author 徐正洲
 * @date 2022/5/4-19:56
 *
 * 面向对象的特征之二：继承性
 *
 * 一、好处
 * 1）减少代码的冗余，提高代码的复用性
 * 2）便于功能的拓展
 * 3）为之后的多态性的使用，提供了前提
 *
 * 二、格式：class A extends B{}
 *      A：子类、派生类、subclass
 *      B：父类、超类、基类、superclass
 *
 *      1）体现：一旦子类A继承父类B以后，A就获得了B的所有属性、方法
 *          特别的：父类中声明为private的属性或者方法，继承之后，仍然可以获取，只是因为封装性的影响，不能直接调用。
 *      2）子类继承父类后，可以声明额外的属性和方法，实现功能的拓展。
 *
 * 三、java中关于继承性的规定
 *  1）一个类可被多个类继承
 *  2）一个类只能有一个父类，不可继承多个类，或者串行继承。
 *  3）子类直接继承的父类，称为：直接父类，间接继承的父类称为：间接父类。
 *  4）如果没有显式的继承一个类，则继承于java.lang.Object类
 *  5）所有类都直接或者间接的继承Object类
 *
 */
public class ExtendTest {
    public static void main(String[] args) {
        Inherit inherit = new Inherit();
        inherit.eat();

        Student student = new Student();
        student.eat();

        Creature creature = new Creature();
        creature.hashCode();


    }
}