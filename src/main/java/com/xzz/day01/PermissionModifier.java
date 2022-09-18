package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:08
 * 一、权限修饰符的使用：
 * 1、private 在本类内属性、方法可以被调用，
 * 2、缺省（default）在包内类和属性可以被调用，
 *
 */
public class PermissionModifier {
    private int age;
    int phone;
    public int sfz;

    private void method(){
        age =1;
        phone=2;
        sfz=3;

    }
    void method2(){
        age =1;
        phone=2;
        sfz=3;
    }

    public void method3(){
        age =1;
        phone=2;
        sfz=3;
    }


}