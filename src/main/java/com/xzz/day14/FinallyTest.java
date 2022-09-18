package com.xzz.day14;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 徐正洲
 * @date 2022/5/16-20:18
 *
 * 1)Finally是可选的
 * 2）即使catch中又出现异常，try中有return语句等，还是一定会执行
 * 3）像数据库连接、输入输出流、网络编程Socket等资源、jvm是不能自动回收的，需要我们自己声明，所以需要声明在finally中
 *
 */
public class FinallyTest {
    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
            System.out.println("hello");
        }catch (ArithmeticException e){
            int[] ints = new int[10];
            System.out.println(ints[11]);
        }finally {
            System.out.println("我还可以跑");
        }
    }
    @Test
    public void test2(){
        FileInputStream fileInputStream = null;
        try {
            File file = new File("hell.txt");
            fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read();
            while (read !=-1){
                System.out.println((char)read);
                read=fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}