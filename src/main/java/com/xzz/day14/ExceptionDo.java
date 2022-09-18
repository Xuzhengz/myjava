package com.xzz.day14;

import org.junit.Test;

/**
 * @author 徐正洲
 * @date 2022/5/16-19:54
 *
 * 异常处理的方式：抓抛模型
 * 过程一：“抛”，程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 *              并将此对象抛出。
 *              一旦抛出对象以后，其后的代码就不再执行。
 *
 *         关于异常对象产生：1、系统自动生成的异常对象
 *                        2、手动生成一个异常对象，并且抛出（throw）
 *
 * 过程二：“抓”，可以理解为异常的处理方式
 * 1、try-catch-finally：出现异常有能力解决
 *
 * 1）finally是可选的。如果有，则在finally里的代码必须执行。
 * 2）使用try将可能出现异常的代码装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象
 * 3）如果catch的异常有继承关系，需要将子类写在前面，否则报错。
 * 4）打印异常的方式： getMessage打印异常信息、 printStackTrace() 打印异常的对象
 * 5）在try定义的变量，出了以后就不能在调用，
 * 6）try-catch-finally 可以相互嵌套
 *
 * 2、throws+异常类型：出现异常没能力解决，把异常往上抛
 *
 *
 * 
 */
public class ExceptionDo {
    @Test
    public void test(){
     try {
         int a = 10;
         int b = 0;
         System.out.println(a/b);
         System.out.println("hello");
     }catch (ArithmeticException e){
         e.printStackTrace();
     }finally {
         System.out.println("我还可以跑");
     }
    }
}