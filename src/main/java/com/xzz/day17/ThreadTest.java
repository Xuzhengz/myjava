package com.xzz.day17;

/**
 * @author 徐正洲
 * @date 2022/5/21-20:02
 *
 * Thread的常用方法
 * 1、start方法 调用线程的run方法
 * 2、run方法通常重写thread类中的方法，将要实现的功能声明此中
 * 3、currentThread静态方法、返回执行当前的线程
 * 4、getName方法返回当前线程的名称
 * 5、setName方法设置当前线程的名称
 * 6、yield() 释放当前cpu执行权
 * 7、join() 在线程A 调用线程B 的join  此时线程A 进入阻塞状态，一直等到线程b执行完
 * 8、sleep() 线程睡眠指定的时间
 * 9、isAlive 判断线程是否存活
 * 
 * 
 * 线程的优先级
 * 1、max ：10
 * 2、min：1
 * 3、norm：5
 *
 * 如何获取和设置线程的优先级
 * 1）获取：getPriority()
 * 2）设置：setPriority()
 *
 * 优先级大并不意味该线程完全优先于其它线程，执行完在执行其它线程，只是执行的概率大于其它线程。
 */
public class ThreadTest extends Thread {

    public ThreadTest(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    // Thread 类中的run 方法 没有抛异常，所以只能 try-catch
//                    sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":" + i + "\t" + Thread.currentThread().getPriority());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

            }
//            if (i % 20 ==0){
//                yield();
//            }
        }
    }
}
class test{
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest("线程一");
//        threadTest.setName("线程一：");
        threadTest.setPriority(Thread.MAX_PRIORITY);
        threadTest.start();


        //给主线程设置名称
        Thread.currentThread().setName("主线程：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                Thread.currentThread().setPriority(9);
                System.out.println(Thread.currentThread().getName() + ":" + i + "\t" + Thread.currentThread().getPriority());
            }
//            if (i== 20){
//                try {
//                    threadTest.setPriority(1);
//                    threadTest.join();
//                    int priority = threadTest.getPriority();
//                    System.out.println(priority);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(threadTest.isAlive());
    }
}