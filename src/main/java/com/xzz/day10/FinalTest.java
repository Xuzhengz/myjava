package com.xzz.day10;

/**
 * @author 徐正洲
 * @date 2022/5/12-19:23
 *
 * final关键字:最终的
 *
 * 1、修饰的结构：类、方法、变量-----》最终的
 * 2、修饰类：不能被其它类所继承，（没有子类） 比如String、System、StringBuffer类
 * 3、修饰方法：表示此方法不能被重写。
 * 4、修饰变量：此时的“变量”称为常量，固定值。
 * 2）显示初始 / 3）（非）静态代码块初始
 * 4）构造器初始
 * 5）局部变量：尤其修饰形参时，表明该形参为一个常量
 *
 * 5、static final 修饰属性：全局常量
 *
 *
 *
 */
public class FinalTest {
    final int age=1;
    public final void eat(){

    }
}
final class FinalA extends FinalTest{
    public static void main(String[] args) {
        FinalA finalA = new FinalA();
//        finalA.age=2;
        System.out.println(finalA.age);
    }
//    public final void eat(){
//
//    }
}

/*
class FinalB extends FinalA{

}*/
