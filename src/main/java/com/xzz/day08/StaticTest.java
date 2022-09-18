package com.xzz.day08;

/**
 * @author 徐正洲
 * @date 2022/5/10-20:08
 * <p>
 * static关键字的使用
 * 1、可以用来修饰 属性、方法、代码块、内部类
 * <p>
 * 2、static修饰属性
 * 1)静态变量
 * 2）对象可共享该属性,当通过某一个对象修改静态变量时，其它对象也使用同时修改后的变量
 * 3）静态变量随着类的加载而加载、加载早于对象的创建，并且在内存方法区的静态域中也只存在一份。
 * <p>
 * 类变量    实例变量
 * 类          yes       no
 * 对象         yes       yes
 * <p>
 * <p>
 * <p>
 * <p>
 * 3、static修饰方法：静态方法
 * 类变量    实例变量
 * 类          yes       no
 * 对象         yes       yes
 * <p>
 * 1）静态方法中只能调用静态的方法或者属性
 * 2）非静态方法中，都可以调用。
 * 3) 在静态的方法中 this和super关键字不能使用。
 *
 *
 * 4、总结：如何确认属性、方法是否声明为static
 * 1）当属性是可以被多个对象共享的，不会随着对象的不同而不同
 * 2）当要操作静态的属性的方法，通常为static
 * 3）工具类中的方法，习惯声明为static
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.eat();
        Chinese.nation = "America";
        Chinese chinese = new Chinese();
        chinese.name = "徐正洲";
        chinese.age = 23;
        System.out.println(chinese.eat());
        chinese.nation = "CHINA";


        Chinese chinese2 = new Chinese();
        chinese2.name = "徐文涛";
        chinese2.age = 20;
        System.out.println(chinese2.nation);
        System.out.println(chinese2.eat());

    }
}

class Chinese {
    String name;
    int age;
    static String nation;

    public void show() {
        System.out.println("handsome");
    }

    public void info() {

        System.out.println(name + "\t" + nation);
    }

    public static String eat(){
        return "food";
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }
}

