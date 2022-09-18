package com.xzz.day26;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author 徐正洲
 * @date 2022/6/2-10:37
 *
 * Set：无序，不可重复。
 * HashSet：主要实现类，线程不安全，可以存储 null值
 * LinkedHashSet：作为HashSet子类，遍历其内部数据时，可以按照添加的顺序遍历
 * TreeSet：可以按照添加的对象的指定属性，进行排序
 *
 * 1）set接口中没有额外的方法，都是collection中的方法
 * 2）向set中添加数据，其所在的类一定要重新 hashCode和equals方法
 * 3）一致性
 *
 * 以HashSet为例：
 * 2）无序性：不等于随机性，插入的数据是无序的，是根据数据的hash值决定
 * 3）不可重复性：保证添加的元素按照equals方法判断，相同的元素只能添加一个，
 * 4）添加元素的过程：
 *                  向HashSet添加元素a，首先使用a的hashcode值通过算法计算出在hashset存放的位置
 *                  判断此位置上是否有元素，如果无，则插入，若有，首先比较hash值，如果不相同，则a插入成功（以链表方式存储）
 *                  若相同，比较equals方法，相同则去除本次插入的元素。
 * 5）底层：数组 + 链表的结构
 *
 *
 */
public class SetTest {
    @Test
    public void test() {
        Set hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(456);
        hashSet.add(new Person("徐",12));
        hashSet.add(123);
        hashSet.add(new Person("徐",13));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    //LinkedHashSet 作为HashSet子类
//    在添加数据的同时，每个数据还维护了两个引用，记录此数据前后的数据
        @Test
        public void test2(){
            Set hashSet = new LinkedHashSet();
            hashSet.add(123);
            hashSet.add(456);
            hashSet.add(new Person("徐",12));
            hashSet.add(123);
            hashSet.add(new Person("徐",31));
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }


    }
}