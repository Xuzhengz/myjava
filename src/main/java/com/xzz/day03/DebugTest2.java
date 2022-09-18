package com.xzz.day03;

import java.security.PublicKey;

/**
 * @author 徐正洲
 * @date 2022/5/5-20:28
 *
 * 1、调试程序方法一：sout输出
 * 2、debug调试
 */
public class DebugTest2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i + "\t" + j);

        DebugTest2 debugTest2 = new DebugTest2();
        int max = debugTest2.getMax(i, j);
        System.out.println("max=" + max);

    }

    public int getMax(int i, int j) {
        int max = (i > j) ? j : i;
//        int max = 0;
//        if (i > j) {
//            max = i;
//        } else {
//            max = j;
//        }
        return max;
    }
}