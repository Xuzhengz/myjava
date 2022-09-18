package com.xzz.day15;

/**
 * @author 徐正洲
 * @date 2022/5/17-15:47
 *
 * 自定义异常类
 * 1、继承现有的异常结构：RuntimeException、Exception
 * 2、提供全局常量serialVersionUID
 * 3、提供父类重载的构造器
 *
 *
 * 异常处理5个关键字：
 * try：执行可能产生异常的代码
 * catch：捕获异常
 * finally：无论是否发生异常代码总被执行
 * throw：异常的产生阶段，手动抛出异常对象
 * throws：异常的处理方式：声明方法可能要抛出的各种异常类
 *
 */
public class MyException extends Exception {
    static final long serialVersionUID = -7034897190711766939L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}