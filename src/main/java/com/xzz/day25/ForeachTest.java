package com.xzz.day25;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author 徐正洲
 * @date 2022/6/1-20:23
 *
 * 增强for循环:用于遍历集合和数组
 */
public class ForeachTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(true);
        coll.add(new Date());
//        for(集合元素的类型 局部变量 ： 集合对象)
//        内部仍然调用迭代器
        for (Object o : coll) {
            System.out.println(o);
        }
        int[] ints = {1, 2, 3, 4};
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}