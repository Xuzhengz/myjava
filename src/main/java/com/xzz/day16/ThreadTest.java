package com.xzz.day16;

/**
 * @author 徐正洲
 * @date 2022/5/20-19:00
 * <p>
 * 多线程的创建方式一：继承Thread类
 * 1、创建一个继承于Thread的子类
 * 2、重写run方法--讲此线程执行的操作声明在run方法中
 * 1)   main方法启动当前线程
 * 2）  调用当前线程的run方法
 * <p>
 * 3、创建子类的对象
 * 4、通过对象调用start()方法--不能调用run 方法方法启动线程。
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        3、创建子类的对象
        MyThread myThread = new MyThread();
//        4、通过对象调用start()方法 开启线程一
        myThread.start();

        // 在开启一个线程二--重新创建一个对象调用start方法。
        MyThread myThread2 = new MyThread();
        myThread2.start();



        //main主线程
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}

//1、创建一个继承于Thread的子类
class MyThread extends Thread {
    //    2、重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}