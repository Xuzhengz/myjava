package com.xzz.day18;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 徐正洲
 * @date 2022/5/23-20:30
 *
 * 解决线程安全问题的方式三：lock锁
 *
 * sysnchronized与Lock的异同
 * 1、相同点：都可以用来解决线程安全问题。
 * 2、不同点：sysnchronized在执行完代码后，自动释放锁
 *          lock需要手动启动同步，同时手动释放锁
 *
 * 优先使用顺序：lock --- > 同步代码块 ---> 同步方法
 */
public class LockTest {
    public static void main(String[] args) {
        Windows windows = new Windows();
        Thread thread1 = new Thread(windows);
        Thread thread2 = new Thread(windows);
        Thread thread3 = new Thread(windows);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Windows implements Runnable{
    private int ticket= 100;
    //1、实例化lock对象
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                // 调用lock方法
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖票了，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //3、调用解锁方法
                lock.unlock();
            }
        }
    }
}