package com.xzz.day07;

import com.xzz.day05.Person;

/**
 * @author 徐正洲
 * @date 2022/5/9-9:22
 *
 * object中tostring()的使用
 *  1、输出一个对象的引用时，实际就是调用对象的tostring方法
 *  2、object中tostring方法的定义：
 *
 *     public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *  3、大部分object类之外的类都重写过tostring方法 输出的是 "实体内容"
 *
 *  4、自定义类重写tostring方法
 *
 *
 */
public class ToStringTest {
    private String name;
    public ToStringTest(){

    }
    public ToStringTest(String name){
        this.name =name;
    }

    public static void main(String[] args) {
//        Person person = new Person("xuzz", 23);
//        System.out.println(person.toString());
//        System.out.println(person);
//
//        String mm = new String("MM");
//        System.out.println(mm);
        ToStringTest mm = new ToStringTest("MM");
        System.out.println(mm.toString());
    }

    @Override
    public String toString() {
        return "ToStringTest{" +
                "name='" + name + '\'' +
                '}';
    }
}