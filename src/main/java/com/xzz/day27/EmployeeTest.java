package com.xzz.day27;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 徐正洲
 * @date 2022/6/3-20:58
 */
public class EmployeeTest {
    //自然排序
    @Test
    public void test() {
        TreeSet treeSet = new TreeSet();
        Employee xu1 = new Employee("xuzhengzhou", 21, new MyDate(2000, 12, 07));
        Employee xu2 = new Employee("xuzz", 11, new MyDate(2001, 12, 07));
        Employee xu3 = new Employee("xuwentao", 31, new MyDate(2008, 12, 07));
        Employee xu4 = new Employee("xzz", 44, new MyDate(2002, 12, 07));
        Employee xu5 = new Employee("xwt", 12, new MyDate(1998, 12, 07));
        treeSet.add(xu1);
        treeSet.add(xu2);
        treeSet.add(xu3);
        treeSet.add(xu4);
        treeSet.add(xu5);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //按照生日日期排序
    @Test
    public void test2() {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee employee1 = (Employee) o1;
                    Employee employee2 = (Employee) o2;
                    MyDate birthday1 = employee1.getBirthday();
                    MyDate birthday2 = employee2.getBirthday();
                    int year = birthday1.getYear() - birthday2.getYear();
                    if (year != 0) {
                        return year;
                    }
                    int month = birthday1.getMonth() - birthday2.getMonth();
                    if (month != 0) {
                        return month;
                    }
                    return birthday1.getDay() - birthday2.getDay();
                }
                throw new RuntimeException("输入的类型不匹配");
            }
        });
        Employee xu1 = new Employee("xuzhengzhou", 21, new MyDate(2000, 12, 07));
        Employee xu2 = new Employee("xuzz", 11, new MyDate(2001, 12, 07));
        Employee xu3 = new Employee("xuwentao", 31, new MyDate(2008, 12, 07));
        Employee xu4 = new Employee("xzz", 44, new MyDate(2002, 12, 07));
        Employee xu5 = new Employee("xwt", 12, new MyDate(1998, 12, 07));
        treeSet.add(xu1);
        treeSet.add(xu2);
        treeSet.add(xu3);
        treeSet.add(xu4);
        treeSet.add(xu5);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}