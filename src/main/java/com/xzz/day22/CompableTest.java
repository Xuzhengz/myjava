package com.xzz.day22;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 徐正洲
 * @date 2022/5/29-16:34
 * <p>
 * 比较器：Comparable、Comparator
 * <p>
 * 1、Comparable接口的使用
 * 1）重写compareTo方法
 * 如果当前对象大于形参 返回正整数
 * 如果当前对象小于形参 返回负整数
 * 如果当前对象等于形参 返回0
 * 2）对应自定义类实现比较大小，需要重写比较方法（自然排序）。
 *
 * 2、Comparator
 * 1、重写Compare(Object o1,Object o2)方法
 *
 */
public class CompableTest {
    @Test
    public void test() {
        String[] arr = new String[]{"哥哥", "姐姐", "AA"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test1() {
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("华为", 4000);
        goods[1] = new Goods("苹果", 6000);
        goods[2] = new Goods("小米", 2000);
        goods[3] = new Goods("魅族", 1000);
        String[] arr = new String[]{"哥哥", "姐姐", "AA"};

//        Arrays.sort(goods);
//        System.out.println(Arrays.toString(goods));
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods s1 = (Goods)o1;
                    Goods s2 = (Goods)o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(goods));

//        int i1 = goods[3].compareTo(goods[0]);
//        System.out.println(i1);


    }

}

class Goods implements Comparable {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //    指明商品比较大小的属性
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.price > goods.price) {
                return 1;
            } else if (this.price < goods.price) {
                return -1;
            } else {
                return 0;
            }
        }
        throw new RuntimeException("商品信息有错误");
    }
}
class Goods2 implements Comparator {
    private String name;
    private double price;

    public Goods2() {
    }

    public Goods2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //    指明商品比较大小的属性
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}