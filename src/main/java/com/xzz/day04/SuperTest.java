package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/6-20:45
 *
 * Super关键字的使用
 * 1：super：理解为父类的对象
 * 2：super：可以用来修饰属性、方法、构造器
 * 3：super使用：
 *      1）载子类的方法或者构造器中，通过super.属性或者super.方法调用父类的属性或方法
 *      2）特性情况：当子类或者父类定义了同名的属性时，要想在子类中调用父类的属性或者方法时，必须要使用super调用父类的
 */
public class SuperTest {
    public static void main(String[] args) {
        SuperSub superSub = new SuperSub("数学");
        superSub.show();
    }
}