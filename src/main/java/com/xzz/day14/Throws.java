package com.xzz.day14;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 徐正洲
 * @date 2022/5/16-20:42
 *
 * 方式二：throws + 异常类型
 * 1）抛出谁调用 谁承担，抛到mian方法处，使用try-catch处理
 * 2）异常并没有完整的处理完。
 */
public class Throws {
    public static void main(String[] args) {
        try {
            test2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void test2() throws IOException {
        test();
    }
    @Test
    public static void test() throws IOException {
        File file = new File("xzz.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data!=-1){
            System.out.println((char)data);
            data = fileInputStream.read();
        }
        fileInputStream.close();

    }
}