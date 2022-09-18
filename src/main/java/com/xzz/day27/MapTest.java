package com.xzz.day27;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author 徐正洲
 * @date 2022/6/3-21:23
 * Map：双列数据、存储键值对的数据
 *      HashMap：主要实现类，线程不安全，效率高，存储null的key和value。
 *          LinkedHashMap：保证在遍历map元素时，可以按照添加的元素的顺序实现遍历
 *      TreeMap：保证按照key-value对进行排序遍历。按照key的自然排序或者定制排序。
 *              底层使用红黑树。
 *      Hashtable：古老的实现类，线程安全，效率低，不能存储null的key和value。
 *          properties：常用来处理配置文件，key和value都是String类型
 *
 *      HashMap：底层采用 数组、链表、红黑树
 *
 * 面试题：
 * HashMap底层实现原理
 * HashMap和Hashtable异同
 *
 * Map结构的理解
 * 1）key不可重复，无序，使用set存储key---所在类重写equals和hashCode方法 以hashMap为例
 * 2）value 无序、可重复、使用collection存储所有的value--所在类重写equals方法
 * 3）key和value构成了一个entry对象
 *
 * jdk1.8：HashMap底层没有创建一个长度为16的数组
 *         底层数组是Node[]、而非Entry[]
 *         首次调用put方法时，底层创建长度为16的数组
 *         jdk7底层只有数组、链表、jdk8 采用 数组、链表、红黑树
 *         当数组的某一个索引位置上的元素以链表形式存在的数据个数>8个且数组长度超过64，
 *         此时索引为主的所有数据改为红黑树存储
 *
 *         默认容量：16、默认加载因子：0.75 扩容的临界值：容量 * 因子 ：16 * 0.75 =12
 *                  bucket中的链表长度大于默认值，转为红黑树：8
 *                  桶中的node被树化时最小饿hash表容量：64
 *
 *
 *
 *
 */
public class MapTest {
    @Test
    public void test(){
        HashMap hashMap = new HashMap();
        hashMap.put(null,null);
        hashMap.put("null1",null);
        System.out.println(hashMap.toString());

    }
}