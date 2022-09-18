package com.xzz.day20;

import org.junit.Test;

import java.security.PublicKey;

/**
 * @author 徐正洲
 * @date 2022/5/26-8:52
 * <p>
 * String常用类：
 * <p>
 * 1、声明为final，不可被继承
 * 2、实现了serializable、comparable接口，表示字符串可以被序列化、比较大小
 * 3、内部定义了 final char[] value 用于存储字符串数据
 * <p>
 * 4、string：不可变性
 * 1）重新赋值，需要重写指定内存区域赋值，不能对原有的进行修改
 * 2）对现有字符串拼接，也需要重写指定内存区域
 * 3）当替换其中字符，也需要重写指定内存区域
 * <p>
 * 5、字符串常量池中不会存储相同内容的字符串。
 * <p>
 * 面试题： String s3 = new String("abc"); 创建了几个对象
 * 两个：一个是堆空间new结构、另一个是char[] 对应常量池中的数据"abc"。
 * <p>
 * 结论：    当字符串有变量拼接 存在堆空间，所以不相等
 * 当字符串都是字面量 存在常量池，所以相等
 * 如果拼接的结果调用intern方法，返回值就在常量池中
 */
public class StringTest {
    @Test
    public void test() {
//        String的实例化方法
//           1、字面量定义方式
        String s1 = "abc";
        String s2 = "abc";
//        2、通过new + 构造器的方式
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //false

    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = (s1 + s2).intern();
        String s8 = s5.intern();

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//true
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false
        System.out.println(s3 == s8);//true

    }
@Test
    public void test3() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);

        final String s4 ="javaEE";
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5);
    }

}