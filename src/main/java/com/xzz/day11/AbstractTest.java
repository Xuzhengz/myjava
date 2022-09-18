package com.xzz.day11;

/**
 * @author 徐正洲
 * @date 2022/5/13-10:19
 *
 *  abstract关键字的使用：
 *  修饰：类、方法
 *
 *  1、抽象类
 *  1）类不能实例化
 *  2）抽象类中一定有构造器，便于子类实例化时调用
 *
 *  2、抽象方法
 *  1）只有方法的声明，没有方法体
 *  2)包含抽象方法的类，一定是一个抽象类
 *  3）若子类重写了父类的所有方法，方可实例化、若没重写完，该类也为抽象类。
 *
 */
public abstract class AbstractTest {
    String name;
    int age;
    public abstract void show();

    public void eat(){
        System.out.println("人都要吃饭");
    }
}
class Person extends AbstractTest{
    public static void main(String[] args) {
//        AbstractTest abstractTest1 = new AbstractTest();  不能实例化
        AbstractTest abstractTest = new Person();
        abstractTest.eat();
    }

    @Override
    public void show() {

    }

//    @Override
//    public void eat() {
//        System.out.println("我就不吃，你能拿我怎么样！！！");
//    }

}