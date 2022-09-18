package com.xzz.day20;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 徐正洲
 * @date 2022/5/27-19:55
 * StringBuffer、StringBuilder
 *
 * 扩容问题：底层数组长度装不下，需要扩容。默认情况下 为原有2 倍+2 将原有数组的元素赋值到心的数组中
 * 建议使用 StringBuffer(int capacity)
 *
 * StringBuff:
 *              增：append()
 *              删：delete()
 *              改：replace()、setCharAt()
 *              查：charAt()
 *              长度：length()
 *              遍历：for()、char()
 *
 */
public class StringBufferBuilderTest {
//    StringBuffer、StringBuilder、String异同
//    String：不可变的字符串、使用char[]存储
//    StringBuffer：可变的字符串：线程安全、效率低 使用char[]存储
//    StringBuilder：可变的字符串 线程不安全、效率高 使用char[]存储


@Test
    public void test(){
    //new char[16] 相当于底层创建了一个长度为16的char[]
        StringBuffer abc = new StringBuffer("abc");
        // length() + 16 的char[]数组
        abc.setCharAt(0,'m');
        System.out.println(abc);

    StringBuffer stringBuffer = new StringBuffer();
    System.out.println(stringBuffer.length());// 0
}
@Test
    public void test2(){
    StringBuffer s1 = new StringBuffer("abc");
    s1.append(1);
    s1.append("2");
    System.out.println(s1);
    //左闭右开
//    StringBuffer s2 = s1.delete(2, 4);
//    System.out.println(s2);
//    System.out.println(s1);
    //修改
//    System.out.println(s1.replace(0, 2, "hh"));
    //插入
//    System.out.println(s1.insert(4, 2));
    //反转
//    System.out.println(s1.reverse());



}
}