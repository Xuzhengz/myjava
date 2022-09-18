package com.xzz.day14;

/**
 * @author 徐正洲
 * @date 2022/5/16-19:27
 * 异常
 * Error： JVM无法解决的严重问题
 *
 * Exception：其它因编程错误或者偶然的外在因素导致对的一般性问题，可以用针对性的代码进行处理
 *
 * 异常类型：
 * 1）编译时异常
 * 2）运行时异常
 */
public class ErrorTest {
    public static void main(String[] args) {
//        main(args);    栈溢出

        Integer[] integers = new Integer[1024 * 1024 * 1024];


    }
}