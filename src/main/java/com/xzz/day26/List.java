package com.xzz.day26;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


/**
 * @author 徐正洲
 * @date 2022/6/2-10:13
 * <p>
 * List常用方法:
 * <p>
 * 总结方法：
 * 增：add
 * 删：remove（index|obj）
 * 改：set
 * 查：get
 * 插：add
 * 长度：size
 * 遍历：foreach、iterator
 * <p>
 * 面试题：
 * remove中 index 和 obj
 * 删除指定元素索引：直接填下标
 * 删除指定元素数据：new包装类
 */
public class List {
    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(new Person("徐",12));
        list.add(123);
        System.out.println(list);
        list.add(1, 456);
        System.out.println(list);
        java.util.List integers = Arrays.asList(1, 2, 3);
        //将新的集合每个元素单次插入到调用的集合实例中
//        list.addAll(integers);
        //将新的集合作为整体插入到调用的集合实例中
//        list.add(integers);
        //获取指定集合的元素
        System.out.println(list.get(2));
//        获取元素在集合的下标，如果不存在返回-1
        System.out.println(list.indexOf(456));
        //remove 删除集合元素
        list.remove(1);
        System.out.println(list);
        //修改集合元素
        list.set(1, "徐");
        System.out.println(list);
        //返回左闭右开的集合元素
//        System.out.println(list.subList(1, 2));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //按照姓名从小到大排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            return this.name.compareTo(person.name);
        } else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}