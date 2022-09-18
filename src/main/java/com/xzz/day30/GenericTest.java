package com.xzz.day30;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 徐正洲
 * @date 2022/6/6-16:39
 * 1、泛型在继承方面的体现
 * <p>
 * 2、通配符的使用
 */
public class GenericTest {
    /**
     * 1、泛型在继承方面的体现
     * 1）虽然类A是类B的父类，但是G<A> G<B>二者不具备子父类的关系，二者为并列关系
     * 2)正确：A<G> = B<G>
     */
    @Test
    public void test() {
        Object object = null;
        String string = null;
        object = string;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时的list1和list2的类型不具有子父类关系
//        list1 = list2;
        List<Integer> list3 = null;
//        list3 = list2;
    }

    @Test
    public void test2() {
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;


    }

    /**
     * 2、通配符的使用： ？
     * 对于list<?> 不能添加数据，只能添加null
     * 获取（读取）：允许读取数据，类型为Object
     */
    @Test
    public void test3() {
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;
        list = list1;
        list = list2;

        print(list1);
        print(list2);


    }

    public void print(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            Object object = iterator.next();
        }
    }

    /**
     * 3、有限制条件的通配符的使用
     * ? extends Person: List<? extends Person> 是 List<Person>和List<Student>的父类 ，Student是Person的子类
     * ? super Person: List<? super Person> 是 List<Person>和List<Student>的父类，Person 是 Student的父类
     */
    @Test
    public void test4() {
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;
        List<Person> list3 = new ArrayList<>();
        List<Student> list4 = null;
        List<Object> list5 = null;
        list1 = list3;
        list1 = list4;
//        list1 = list5;
        list2 = list3;
//        list2 = list4;
//        list2 = list5;

        //读取数据：
        list1 = list3;
        Person person = list1.get(0);
        System.out.println(person);

//        list1.add(new Person());
        list2.add(new Person());
        list2.add(new Student());



    }
}