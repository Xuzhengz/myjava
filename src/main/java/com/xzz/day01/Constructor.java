package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-20:31
 * <p>
 * 构造器的使用：
 * <p>
 * 一、作用
 * 1、用来创建对象
 * 2、初始化对象的属性，赋值。
 * <p>
 * 二、说明
 * 1、如果没用显示的定义构造器，则提供一个空参的构造器
 * 2、定义构造器的格式：权限修饰符 类名（形参列表）{}
 * 3、一个类中定义多个相同名称，但形参不同的构造器，彼此构成重载。
 * 4、一旦我们定义了类的构造器，则系统不在提供空参构造器，如果需要使用，则需要重载构造器。
 * 5、一个类中，至少存在一个构造器。
 */
public class Constructor {
    public static void main(String[] args) {
        Person person = new Person("tom",18);
        System.out.println(person.getName());

    }


    static class Person {
        //属性
        private String name;
        private int age;

        //构造器
        public Person() {
//            System.out.println("构造器");
            age = 18;

        }

        public Person(String n,int a) {
            name =n;
            age = a;
        }


        public void eat() {
            System.out.println("人可以吃饭");
        }

        public void setName(String n){
            name =n;
        }
        public String getName(){
            return name;
        }

    }
}