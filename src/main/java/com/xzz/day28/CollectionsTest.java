package com.xzz.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author 徐正洲
 * @date 2022/6/4-19:55
 *
 * Collections工具类：操作集合和Map的工具类。
 *常用方法：
 *
 *
 *
 *
 * 面试题：Collection和Collections区别
 * 1）Collection是创建单列数据的集合接口
 * 2）Collections是操作集合和Map的工具类。
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("dasda");
        list.add("qwq");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.swap(list,0,2);
        System.out.println(list);
        System.out.println(Collections.frequency(list, 123));
        List list2 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list2,list);
        System.out.println(list2);

        //线程安全：list1为线程安全的集合
        List list1 = Collections.synchronizedList(list);
        System.out.println(list1);


    }
}