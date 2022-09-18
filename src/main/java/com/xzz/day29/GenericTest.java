package com.xzz.day29;

import org.junit.Test;

import java.util.*;

/**
 * @author 徐正洲
 * @date 2022/6/5-19:33
 *
 * 泛型：允许定义类、接口时通过一个标识表示类中的某个属性的类型或者是某个方法的返回值及参数类型
 *
 * 集合中使用泛型：
 * jdk1.5中 集合类、接口都声明带泛型，且可以指定泛型类型
 * 内部属性使用到泛型的时候，只能按照泛型的类型声明。
 * 泛型的必须是一个类，可用包装类。
 *
 *
 * 自定义泛型接口：类、接口、方法
 * 注意：
 * 1）泛型不同的引用不能相互赋值
 * 2）静态方法中不能使用类的泛型
 * 3）异常类不能为泛型类
 */
public class GenericTest {
    @Test
    public void test(){
        //集合没有使用泛型
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //可以存放任何类型，类型不安全
        list.add("NoSecurity");
        for (Object o : list) {
            System.out.println(o);
        }
    }
    @Test
    public void test2(){
        //集合使用泛型，只能使用包装类。
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(111);
        //只能存放指定泛型类型的元素,保证数据的安全。
//        list.add("NoSecurity");
        for (Integer integer : list) {
            //避免强转操作。
            System.out.println(integer);
        }

    }
    @Test
    public void test3(){
        //集合使用泛型，只能使用包装类。
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("AA",123);
        stringIntegerHashMap.put("BB",456);
        stringIntegerHashMap.put("CC",789);
        stringIntegerHashMap.put("DD",111);
        //只能存放指定泛型类型的元素,保证数据的安全。
//        System.out.println(stringIntegerHashMap);
        Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + value);
        }

    }
    @Test
    public void test4(){
        Exer1<String> stringExer1 = new Exer1<>();
        Integer[] integers = new Integer[]{1,2,3};
        List<Integer> copy = stringExer1.copy(integers);
        for (Integer integer : copy) {
            System.out.println(integer);
        }

    }
}