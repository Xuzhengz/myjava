package com.xzz.day24;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * @author 徐正洲
 * @date 2022/5/31-13:48
 * <p>
 * 一、集合框架的概述
 * 1、集合、数组都说对多个数据进行存储的结构、简称java容器。不涉及持久化存储（仅内存）
 * 2、数组的弊端：
 * 1）一旦初始化之后，长度固定
 * 2）需要指定数组的元素类型，也只能操作指定类型的元素
 * 3）对元素的操作方法非常有限，比如获取数组的实际存储的个数
 * <p>
 * 二、java集合的两种体系
 * 1、collection：单列集合、用来存储一个一个的对象
 * 1）list接口：存储有序、可重复的数据---动态数组
 * 2）set接口：存储无序、不可重复的数据--“集合”
 * <p>
 * 2、map：双列集合、用来存储一对（key、value）一对的数据
 * <p>
 * 三、collection接口的方法
 * 1）add
 * 2)size
 * 3)clear
 * 4)addAll
 * 5)isEmpty
 * 6)equals需要当前集合和形参集合的元素相同
 */
public class CollectionTest {
    @Test
    public void test() {
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(true);
        coll.add(new Date());
        // size 获取个数
        System.out.println(coll.size());
        Collection coll1 = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll1.add("AA");
        coll1.add("BB");
        coll1.add("123");
        coll1.add(new Date());
//        //将coll1的集合元素添加到coll中
//        coll.addAll(coll1);
        // size 获取个数
//        System.out.println(coll.size());
//        coll.clear();
//        System.out.println(coll);
        //isEmpty判断当前集合是否为空
//        System.out.println(coll.isEmpty());

        //contains 判断当前集合是否包含 obj 会调用obj所在类的equals方法
        System.out.println(coll.contains(new String("AA")));
        //containsAll 判断obj的元素是否都在调用者的集合中
        System.out.println(coll.containsAll(coll1));

    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add("123");
        coll.add(new Date());
        //删除指定元素
//        coll.remove("AA");
        //从当前集合移除指定集合的所有元素
        Collection coll1 = Arrays.asList("AA", "BB");
        coll.removeAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add("123");
        coll.add(new Date());
        Collection coll1 = Arrays.asList("AA", "BB");
        //取交集作为调用的集合元素
        coll.retainAll(coll1);
        System.out.println(coll);

    }

}