package com.xzz.day23;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/**
 * @author 徐正洲
 * @date 2022/5/30-20:00
 *
 * 注解
 *
 * 1）概述：代码里的特殊标记，可以在编译、类加载、运行时被读取
 *          修饰包、类、构造器、方法、成员变量、参数、局部变量的声明
 *          框架= 注解 、 反射 、 设计模式
 *
 * 2）override、deprecad supperssWarning
 *
 * 3）自定义注解、参照@SuppressWarnings
 * 1、使用@interface修饰
 * 2、内部定义成员、通常使用value表示
 * 3、可以指定成员的默认值、使用default定义
 * 4、如果自定义注解没有成员、表面是一个标识作用
 * 5、自定义注解一般会指明两个元注解 Retention、Target
 *
 * 4）元注解：
 * @Retention：修饰注解的声明周期 SOURCE\CLASS(默认)\RUNTIME（反射）
 * @Target：指定注释可以修饰哪些结构
 * @Documented：表示修饰的注解在javac编译时保存下来。
 * @Inherited：被修饰的注解将具有继承性
 *
 * 5）可重复注释、类型注解
 * 1、@Repeatable(MyAnnovations.class)
 * 2、Retention、Target要和MyAnnovations一致
 *
 * 6）注解类型
 * TYPE_PARAMETER：表示该注解能写在类型变量的声明语句中，如泛型
 * TYPE_USER：表示该注解能写在使用类型的任何语句中。
 *
 *
 *
 */

public class Annotation {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        @SuppressWarnings("unused")
        int i =10;
        @SuppressWarnings({"unused","rawtypes"})
        ArrayList objects = new ArrayList<>();
    }
}
//@MyAnnovations({@MyAnnovation(value = "hi"),@MyAnnovation(value = "12")})
@MyAnnovation(value = "hi")
@MyAnnovation(value = "hi2")
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    @Deprecated
    public Person() {
    }
    public void eat(){
        System.out.println("吃饭");
    }

}

class Student<@MyAnnovation T>  extends Person{
    @Override
    public void eat() {
        ArrayList<@MyAnnovation String> strings = new ArrayList<>();
    }
}