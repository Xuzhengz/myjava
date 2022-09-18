package com.xzz.day14;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 徐正洲
 * @date 2022/5/16-19:34
 * 一、
 * java.lang.Throwable
 * java.lang.Error:一般不编写针对性的代码进行处理
 * java.lang.Exception：可以进行异常的处理
 * 编译时异常(checked)
 * IOException
 * FileNotFoundException
 * 。。。。
 * 运行时异常(unchecked)
 * NullPointerException
 * ClassCastException
 * 。。。。
 * <p>
 * 二、常见异常
 */
public class ExceptionTest {
    @Test
//    NullPointerException
    public void test() {
        int[] ints = null;
        System.out.println(ints[3]);
    }

    //ArrayIndexOutOfBoundsException
    @Test
    public void test1() {
        int[] ints = new int[2];
        System.out.println(ints[3]);
    }

    //    ClassCastException
    @Test
    public void test2() {
        Object date = new Date();
        String str = (String) date;
        System.out.println(str);
    }

    //NumberFormatException
    @Test
    public void test3() {
        String string = "123";
        string = "abc";
        int i = Integer.parseInt(string);
        System.out.println(i);
    }

    //InputMismatchException
    @Test
    public void test4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int i = scanner.nextInt();
        System.out.println(i);
        scanner.close();
    }

    //ArithmticException
    @Test
    public void test5() {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

    //编译时异常
    public void test6(){
        File file = new File("hello.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
    }


}


