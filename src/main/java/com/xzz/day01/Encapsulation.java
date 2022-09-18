package com.xzz.day01;

/**
 * @author 徐正洲
 * @date 2022/5/1-19:56
 *
 * 引入：当创建完类得对象后，去调用类得属性的时候，只能使用属性的所属的数据类型的数值范围，并不能控制前台输入的正确范围，
 * 例如age，int数据类型，可输入负数。所以需要使用封装性，将功能封装到方法内，通过手动定义取值范围调取方法使用。
 * 同时避免用户使用 对象.属性进行赋值(同样可以输入负数，需要避免)，需要在类中将属性私有化（private）
 *
 * 封装性：将类的属性私有化，同时提供get()和set()方法给用户使用。
 *
 * 封装性的体现：需要权限修饰符配合
 * 1、四种权限（从小到大）private、缺省、protected、public
 * 2、四种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3、修饰类，只能使用缺省、public。
 *
 * 总结：java提供4中权限修饰符来修饰类及内部结构，体现在调用时的可见性，
 *
 *  */
public class Encapsulation {
    public static void main(String[] args) {
        person person = new person();
        person.age=-10;
        System.out.println(person.getAge(person.age));

    }
    
    static class person{
        private int age;
        
        public int getAge (int i){
            return age;
        }
        public int setAge(int i){
            if (i>0 && i<130){
                age =i;
            }else {
                System.out.println("输入的年龄不合法！！！");
            }
            return i;
        }

    }
}