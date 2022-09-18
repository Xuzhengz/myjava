package com.xzz.day09;

import com.xzz.day05.Man;

/**
 * @author 徐正洲
 * @date 2022/5/11-19:58
 *
 * 1）main方法也是一个普通的静态方法
 */
public class Main {
    public static void main(String[] args) {
//        args = new String[10];
        args[0]="a";
        System.out.println(args[0]);
    }
}

class MainTest{
    public static void main(String[] args) {
//        String[] strings = new String[10];
//        Main.main(strings);
        MainTest mainTest = new MainTest();

    }

    public int[] setInt(int[] ints){
        int[] ints1 = new int[10];
        return ints1;
    }
}