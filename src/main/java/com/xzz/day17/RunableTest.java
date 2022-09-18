package com.xzz.day17;

import org.apache.commons.validator.Var;

/**
 * @author 徐正洲
 * @date 2022/5/22-19:47
 *
 * 实现Runnable接口
 *
 * 1、创建一个实现了unable接口的类
 * 2、实现类去实现unable接口的抽象方法 run
 * 3、创建实现类的对象
 * 4、将对象传到构造器中，创建Thread类的对象
 * 5、通过Thread类的对象调用start
 *
 * 比较创建线程的两种方式：
 * 1、开发中，优先选择 实现runnable接口方式
 * 2、实现的方法没有类的单继承性的局限性
 * 3、实现的方式更适合来出来多个线程共享数据
 * 4、Thread类也实现了runnable接口
 */
public class RunableTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "\t" + Thread.currentThread().getPriority());
            }
        }
    }
}
class MyThread{
    public static void main(String[] args) {
        RunableTest runableTest = new RunableTest();
        Thread thread = new Thread(runableTest); // 如果形参为空，则调用thread类中的run方法，不为空则调用实参的run 方法。
        thread.start();


        //遍历偶数
        Thread thread2 = new Thread(runableTest);
        thread2.start();

    }
}