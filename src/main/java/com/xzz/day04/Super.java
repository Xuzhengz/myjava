package com.xzz.day04;

import sun.java2d.pipe.SpanIterator;

import java.sql.SQLOutput;

/**
 * @author 徐正洲
 * @date 2022/5/6-20:37
 * <p>
 *
 *
 *
 *
 *
 */
public class Super {
    String name;
    int age;
    int id=1001;

    public Super() {

    }
    public Super(String name){
        this.name=name;
    }
    public Super(String name, int age) {
        this(name);  // 避免重写代码，减少代码冗余
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){
        System.out.println("走路");
    }



}