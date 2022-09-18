package com.xzz.day25;

import org.junit.Test;

import java.util.*;

/**
 * @author 徐正洲
 * @date 2022/6/1-19:55
 */
public class CollectTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(true);
        coll.add(new Date());

//        System.out.println(coll.hashCode());

//        集合转换为toArray()
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

//        数组转换为集合 调用Arrays类的静态方法asList()
        ArrayList<String> strings = (ArrayList<String>) Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(strings.toString());



    }

}