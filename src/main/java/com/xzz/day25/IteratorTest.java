package com.xzz.day25;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * @author 徐正洲
 * @date 2022/6/1-20:02
 *
 * Iterator 返回接口的实例，遍历集合的元素
 * 迭代器：
 * 内部方法 hasNext 和 next
 * hasNext：判读是否还有下一个元素
 * next：指针下移，将下移以后的集合位置上的元素返回
 *
 * remove：遍历过程中 删除元素,需要重新实现iterator实例重新遍历。
 */
public class IteratorTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(true);
        coll.add(new Date());
        //返回迭代器实例
        Iterator iterator = coll.iterator();
        //执行一次遍历一个元素
//        System.out.println(iterator.next());
        //循环打印
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //推荐 while
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        // add(object a) 将元素添加到coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(true);
        coll.add(new Date());
        //返回迭代器实例
        Iterator iterator = coll.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            if ("AA".equals(next)){
                iterator.remove();
            }
        }

        Iterator iterator1 = coll.iterator();

        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
        }
    }

}