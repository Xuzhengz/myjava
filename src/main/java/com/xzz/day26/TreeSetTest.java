package com.xzz.day26;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 徐正洲
 * @date 2022/6/2-16:08
 *
 * 1、向TreeSet添加数组，必须是相同类的对象。
 * 2、两种排序方式：自然排序（实现Comparable接口） 和定制排序
 * 3、自然排序中，比较两个对象是否相同的标准为compareTo返回0，不再是equals
 * 4、定制排序中，比较两个对象是否相同的标准为compare返回0，不再是equals
 */
public class TreeSetTest {
    @Test
    public void test(){
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person("xu",12));
        treeSet.add(new Person("zheng",44));
        treeSet.add(new Person("wang",22));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    public void test2() {
        Comparator comparator = new Comparator() {
            //按照名称从小到大
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person person1 = (Person)o1;
                    Person person2 = (Person)o2;
                    return Integer.compare(person1.getAge(),person2.getAge());
                }else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new Person("xu",31));
        treeSet.add(new Person("zheng",21));
        treeSet.add(new Person("wang",22));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}