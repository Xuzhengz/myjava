package com.xzz.day28;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 徐正洲
 * @date 2022/6/4-19:36
 */
public class TreeMapTest {
    @Test
    public void test(){
        //向TreeMap中添加数据，要求keu必须为同一个类的对象
        TreeMap treeMap = new TreeMap();
        Person p1 = new Person("zizz", 23);
        Person p2 = new Person("xuzheng", 33);
        Person p3 = new Person("azz", 13);
        treeMap.put(p1.getName(),p1.getAge());
        treeMap.put(p2.getName(),p2.getAge());
        treeMap.put(p3.getName(),p3.getAge());
        System.out.println(treeMap);
    }
//    定制排序
@Test
public void test1(){
    //向TreeMap中添加数据，要求keu必须为同一个类的对象,必须按key排序
    TreeMap treeMap = new TreeMap(new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Person && o2 instanceof Person){
                Person person1 = (Person)o1;
                Person person2 = (Person)o2;
                return Integer.compare(person1.getAge(),person2.getAge());
            }
            return 0;
        }
    });
    Person p1 = new Person("zizz", 23);
    Person p2 = new Person("xuzheng", 33);
    Person p3 = new Person("azz", 13);
    treeMap.put(p1,21);
    treeMap.put(p2,12);
    treeMap.put(p3,44);
    System.out.println(treeMap);
}
}