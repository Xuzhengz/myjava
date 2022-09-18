package com.xzz.day13;



/**
 * @author 徐正洲
 * @date 2022/5/15-19:33
 *
 * 内部类
 * 1、成员内部类（静态、非静态）
 * 2、局部内部类：方法内、代码块内、构造器内
 *
 * 3、成员内部类
 *      1）作为外部类成员
 *                  调用外部类的结构
 *                  可以被static修饰
 *                  可以被4中不同权限修饰符修饰
 *
 *      2）作为一个类：定义属性、方法、构造器等
 *                  可以使用final、表示不能被继承
 *                  可以被abstract抽象
 *  4、关注如下问题
 *  1）如何实例化
 *  2）如何在成员内部类中区分调用外部类的结构
 *  3）开发局部内部类的使用
 */
public class InnerClass {
    public static void main(String[] args) {
//        1）如何实例化
        Person.EE ee = new Person.EE();
        ee.hh();


    }
}
class Person{
    int age;
    public void show(){
        System.out.println("跳舞");
    }
    //成员内部类
      class DD{
        String name;
        public void eat(){
            show();
            System.out.println("吃饭!!!");
        }


    }
    //成员静态内部类
    static class EE {
        public static void main(String[] args) {
            Person person = new Person();
            person.show();
        }
        public void hh(){
//            Person.this.show();
        }


    }






    public void eat(){
        //局部内部类
        class AA{

        }
    }
    //局部内部类
    {
        class BB{

        }
    }
    //局部内部类
    public Person(){
        class CC{

        }
    }

}
