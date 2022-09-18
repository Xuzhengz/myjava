package com.xzz.day19;

import java.util.Scanner;

/**
 * @author 徐正洲
 * @date 2022/5/24-9:42
 * 线程通信三个方法：
 * wait：当前线程进行阻塞状态，并且释放锁
 * notify：唤醒被wait的一个线程，如果有多个wait线程，优先唤醒优先级高的
 * notifyall：唤醒所有wait线程
 *
 * 注意：
 * 1、wait：notify：notifyall： 三个方法必须使用在 同步代码块或同步方法中
 * 2、wait：notify：notifyall：必须使用同一个同步监视器 否则出现异常。
 * 3、wait：notify：notifyall：定义在Object类中。
 *
 * sleep和wait的异同：
 * 1）两者都表示阻塞
 * 2）声明的位置不同，sleep在Thread类中，wait在Object类中
 * 3）wait只能使用在同步代码块和同步方法中，sleep可以在需要的场景下调用
 * 4）两者都使用在同步代码块和方法中。sleep不会释放锁，wait会释放锁。
 *
 *
 */
public class ThreadCommunication implements Runnable {
    private int num=1;
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 100; i++) {
                synchronized (this) {
                    notify();
                    if (num<=100){
                        System.out.println(Thread.currentThread().getName() + "：" + num);
                        num++;
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        break;
                    }

                }
            }

        }
    }
}

class ThreadCommunicationTest{
    public static void main(String[] args) {
        ThreadCommunication threadCommunication = new ThreadCommunication();
        Thread thread1 = new Thread(threadCommunication);
        Thread thread2 = new Thread(threadCommunication);
        thread1.start();
        thread2.start();
    }
}

class Test524{
    public static void main(String[] args) {
        boolean isFlag =true;
        while (isFlag) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入字符串：");
            String next = scanner.next();
            Test524 test524 = new Test524();
            boolean b = test524.CharLength(next);
            System.out.println(b);
        }
    }
    public boolean CharLength(String value){
        if (value.length() > 3){
            return false;
        }
        return true;
    }
}