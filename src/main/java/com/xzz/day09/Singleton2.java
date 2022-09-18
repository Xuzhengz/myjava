package com.xzz.day09;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author 徐正洲
 * @date 2022/5/11-19:37
 * 单例设计模式
 * 1）只能存在一个对象实例
 *
 * 如何实现：
 * 2）构造器访问权限伟private
 * 3）声明内部类的对象为null，必须是静态的
 * 4）提供公共静态方法调用类的对象
 */
// 懒汉式
public class Singleton2 {

}

class Order{
    //    构造器访问权限伟private
    private Order(){

    }

    //    声明内部类的对象为null，必须是静态的
    private static Order instance = null;

    //    提供公共静态方法调用类的对象
    public static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}