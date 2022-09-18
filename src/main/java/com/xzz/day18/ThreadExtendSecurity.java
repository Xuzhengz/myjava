package com.xzz.day18;

import com.xzz.day09.Main;

/**
 * @author 徐正洲
 * @date 2022/5/22-19:24
 *
 * 使用同步方法解决实现runnable接口安全问题。
 *
 * 例子：创建三个窗口卖票，总票数为100张
 *
 * 存在线程安全问题、待解决。
 *
 * 1、同步方法仍然涉及到同步监视器，只是不需要我们显式的声明
 * 2、非静态的同步方法，同步监视器是 this
 * 3、静态的同步方式，同步监视器是：当前类
 *
 *
 */

//同步方法--实现Runnable接口解决线程安全
public class ThreadExtendSecurity implements Runnable {
    private int ticket = 100;
    @Override
    public  void run() {
        while (true) {
            show();
            }
    }
    public synchronized void show(){ //同步监视器：this
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "窗口卖票了，票号为" + ticket);
                ticket--;
            }
        }
}
class MyThread523_1{
    public static void main(String[] args) {
        ThreadExtendSecurity threadSecurity = new ThreadExtendSecurity();
        Thread thread1 = new Thread(threadSecurity);
        Thread thread2 = new Thread(threadSecurity);
        Thread thread3 = new Thread(threadSecurity);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
//同步方法--继承Thread类解决线程安全
class MethodExtendThread extends Thread{
    private static int ticket = 100;
    @Override
    public  void run() {
        while (true) {
            show();
        }
    }
    public static synchronized void show(){ //同步监视器：static静态  MethodExtendThread类
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "窗口卖票了，票号为" + ticket);
            ticket--;
        }
    }

}
class Mythread523_4{
    public static void main(String[] args) {
        MethodExtendThread methodExtendThread1 = new MethodExtendThread();
        MethodExtendThread methodExtendThread2 = new MethodExtendThread();
        MethodExtendThread methodExtendThread3 = new MethodExtendThread();

        methodExtendThread1.start();
        methodExtendThread2.start();
        methodExtendThread3.start();
    }

}