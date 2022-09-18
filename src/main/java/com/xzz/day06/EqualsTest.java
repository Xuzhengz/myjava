package com.xzz.day06;


import java.util.Objects;

/**
 * @author 徐正洲
 * @date 2022/5/8-19:46
 *
 * 面试题： == 与 eauals() 区别
 *
 * ==：运算符
 * 1）可以使用在基本数据类型变量和引用数据类型变量
 * 2）当是基本数据比较的是数值，当是引用数据类型比较的是地址值
 *
 * equals()：方法
 * 1）不能使用在基本数据类型，只能使用在引用数据类型。
 * 2）Object类中定义的equals方法也是比较的两个对象的地址值是否相同
 * 3）非Object类大部分类中定义的equals方法 比较的是对象的"实体内容"是否相同，而非是地址值。
 *
 *
 * 二、自定义类重写equals方法比较实体对象内容是否相同
 */
public class EqualsTest {
    private int age;

    public EqualsTest(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Object
        EqualsTest equalsTest = new EqualsTest(12);
        EqualsTest equalsTest1 = new EqualsTest(12);
        EqualsTest2 equalsTest2 = new EqualsTest2(12);
        System.out.println(equalsTest.equals(equalsTest1));
        System.out.println(equalsTest.equals(equalsTest2));

        // String
//        String s = new String();
//        String s1 = new String();
//        System.out.println(s.equals(s1));
    }

//    自己手写
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof EqualsTest){
//            EqualsTest equalsTest = (EqualsTest)obj;
////            比较两个对象的每个属性是否相同
//            if (this.age == equalsTest.age){
//                return true;
//            }else {
//                return false;
//            }
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsTest)) return false;

        EqualsTest that = (EqualsTest) o;

        return getAge() == that.getAge();
    }

    @Override
    public int hashCode() {
        return getAge();
    }
}