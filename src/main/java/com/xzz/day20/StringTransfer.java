package com.xzz.day20;

import org.junit.Test;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author 徐正洲
 * @date 2022/5/26-19:59
 * string与其它结构之间的转换
 */
public class StringTransfer {
    @Test
    public void test(){
        String s1 ="123";
//        String转换为 包装类、和基本数据类型
        int i = Integer.parseInt(s1);
        System.out.println(i);

//        包装类和基本数据类型转换成string
        int i1 =123;
        String s = String.valueOf(i1);
        System.out.println(s);

//        String与char[]数组转换--调用toCharArray()
        String s2 ="123abc";
        char[] chars = s2.toCharArray();
        for (int i2 = 0; i2 < chars.length; i2++) {
            System.out.println(chars[i2]);
        }

        char[] chars1 = new char[]{'1','2'};
        String s3 = new String(chars1);
        System.out.println(s3);
    }
    @Test
    public void test2() throws UnsupportedEncodingException {
//        String和byte[]数组之间转换

//        编码：字符串--->字节  看得懂--->看不懂(二进制数据)
//        解码：字节--->字符串  看不懂(二进制数据)--->看得懂
        String s1 ="abc123中国";
        byte[] bytes = s1.getBytes();//使用默认的UTF-8字符集进行转换
        System.out.println(Arrays.toString(bytes));
        // 设置指定的字符集
        byte[] gbks = s1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

//        byte[] 转换成string
        String s2 = new String(s1);
        System.out.println(s2);

        String s3 = new String(gbks);
        System.out.println(s3);//编码和解码集不一致

        String s4 = new String(gbks,"gbk");
        System.out.println(s4);
    }
}