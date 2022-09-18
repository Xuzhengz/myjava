package com.xzz.day28;

import org.junit.Test;

import java.util.*;

/**
 * @author 徐正洲
 * @date 2022/6/4-11:24
 *
 * hashMap方法：
 * 增：put,putAll
 * 删：remove
 * 改：put
 * 查：get,containsKey,equals
 * 长度：size,isEmpty
 * 遍历：keySet,values,entrySet
 */
public class HashMapTest {
    @Test
    public void test(){
        Map hashMap = new HashMap();
        hashMap.put("AA",123);
        hashMap.put(2,456);
        hashMap.put("AA",789);
        hashMap.put("BB","CC");
        System.out.println(hashMap);

        Map hashMap1 = new HashMap();
        hashMap1.put(null,null);
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);

        hashMap1.remove("AA",789);
        System.out.println(hashMap1);
        System.out.println(hashMap1.get("BB"));
        System.out.println(hashMap1.containsKey("AA"));
    }
    @Test
    public void test2(){
        Map hashMap = new HashMap();
        hashMap.put("AA",123);
        hashMap.put(2,456);
        hashMap.put("AA",789);
        hashMap.put("BB","CC");
        //遍历map：
//        1）遍历key
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        2）遍历value
        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println(value);
        }
//        3）遍历key和value
        Set set1 = hashMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            //entrySet中的元素都是entry
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "： " + entry.getValue());
        }

//        方式二：遍历key和value
        Set set3 = hashMap.keySet();
        Iterator iterator3 = set3.iterator();
        while (iterator3.hasNext()){
            Object key = iterator3.next();
            Object value = hashMap.get(key);
            System.out.println(key + "： " + value);
        }

    }
}