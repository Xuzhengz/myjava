package com.xzz.day02;

import com.xzz.day01.Person;

/**
 * @author 徐正洲
 * @date 2022/5/2-16:23
 *
 * this关键字的使用：
 * 1、this可以用来修饰：属性、方法、构造器
 * 2、this修饰属性和方法
 * this可以理解为当前类的对象或者正在创建的对象，用于区分属性和形参重名时，导致值传递无效，this.属性 = 形参。
 *
 * 3、在类的方法中，可以使用this.属性或者this.方法可以调用当前类的对象属性或者方法
 * 通常情况下，我们都选择省略this，如果方法的形参和属性重名时，则需要使用this。
 *
 * 4、修饰构造器
 * 1、解决代码冗余
 * 2、在类的构造器中，可以显示的调用this(形参列表)方式，调用本类指定的构造器，不允许自己调用自己。
 * 3、this使用构造器次数为n-1
 * 4、必须声明当前构造器的首行。并且构造器不能互相调用。
 *
 *
 */
public class This {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(2);
        System.out.println(person.getAge());
        person.eat();

        Person tome = new Person("tome", 12);
        System.out.println(tome.getAge());
    }
    static class Person{
        private String name;
        private int age;

        public Person() {
            eat();

        }
        public Person(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this(age);
            this.name = name;
//            this.age = age;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void eat(){
            System.out.println("该干饭了！！！");
            this.study();
        }
        public void study(){
            System.out.println("该学习了！！！");
        }
    }
}

