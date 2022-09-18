package com.xzz.day35;

import com.xzz.day36.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 徐正洲
 * @date 2022/6/12-19:43
 *
 * 反射：
 *
 */
public class ReflectionTest {
    /**
     * 使用反射调用私有成员属性
     *
     * 1)获取类：Person.class
     * 2)获取构造器：personClass.getDeclaredConstructor(String.class)
     * 3）实例化：declaredConstructor.newInstance("xuzz")
     * 4）获取私有属性：getDeclaredField()
     * 5）获取私有方法：getDeclaredMethod()
     *
     */
    @Test
    public void test() throws Exception {
        //获取Person所属类
        Class personClass = Person.class;

        //获取私有构造器
        Constructor declaredConstructor = personClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        //实例化Person类
        Person xuzz = (Person) declaredConstructor.newInstance("xuzz");
        System.out.println(xuzz);
        //获取私有属性
        Field age = personClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(xuzz,23);
        System.out.println(xuzz);
        //调用私有方法
        Method show = personClass.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(xuzz);
    }
    /**
     * 推荐：使用直接new的方式，
     * 什么时候使用反射：确定不下来new哪个类的对象。
     *                  特征：动态性
     */
}