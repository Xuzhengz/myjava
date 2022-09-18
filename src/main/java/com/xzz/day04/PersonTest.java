package com.xzz.day04;

/**
 * @author 徐正洲
 * @date 2022/5/6-20:01
 *
 * 方法重写（override / overwrite）
 *
 * 1）重写：子类继承父类以后，对父类的方法进行重写，要求：方法名和形参列表一样，进行覆盖
 * 2）应用：重写以后，当创建子类对象后，通过子类对象调用父类中的同名同参数的方法时，实际执行的是子类重写父类的方法。
 * 3）重写规定：
 *          方法声明：权限修饰符 返回值类型 方法名(形参列表){}
 *          约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法
 *
 *          方法名+形参列表需要相同
 *          子类重写的方法权限修饰符>=父类中被重写的方法权限修饰符
 *          如果父类中的方法为private，子类无法进行重写
 *
 *         子类和父类同名同参数的方法要么都声明非static的（考虑重写），要么都声明为static的（不能重写）
 *
 *
 *
 * 方法重载和重写的区别
 * 1）重载形参列表需要不同，重写需要相同
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("计算机");
        person.eat();
        person.sleep(10);
        person.study();
    }
}