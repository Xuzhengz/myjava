package com.xzz.day18;

/**
 * @author 徐正洲
 * @date 2022/5/22-19:55
 * 实现runnable接口 多窗口卖票
 *
 * 1、问题：卖票过程中，出现了重票、错票导致线程安全问题
 * 2、问题出现的原因是：当某个线程操作尚未完成，其它线程也来操作。
 *
 * 3、解决：当一个线程在操作ticket的时候，其它线程不能参与进来。
 *          在java中通过”同步“机制，来解决线程的安全问题。
 *           好处：解决安全问题
 *           坏处：操作同步代码时，只能有一个线程参与，其它线程等待，相当于单线程（局限性）
 *
 *    方式一：同步代码块
 *    synchronized(同步监视器){
 *        //需要被同步的代码
 *    }
 *    说明：操作共享数据的代码，即为需要被同步的代码。 --->不能包含多余代码。
 *          共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
 *          同步监视器：锁。任何一个类的对象，都可以充当锁，要求多个线程必须要共用一把锁。
 *
 *          实现Runnable接口中可以使用 this 充当同步监视器。
 *          继承Thread类解决线程安全可以使用当前类充当同步监视器。
 *
 *    方式二：同步方法
 *          如果操作共享数据的代码完整的声明在一个方法中，不妨将此方法声明同步。
 */



//同步代码块---实现Runnable接口线程安全
public class ThreadSecurity implements Runnable {
    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized(object){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖票了，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
class MyThread523{
    public static void main(String[] args) {
        ThreadSecurity threadSecurity = new ThreadSecurity();
        Thread thread1 = new Thread(threadSecurity);
        Thread thread2 = new Thread(threadSecurity);
        Thread thread3 = new Thread(threadSecurity);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//同步代码块---继承Thread线程安全
class BlockExtendThread extends Thread{
    private static int ticket = 100;
//    private static Object object = new Object();
    @Override
    public void run() {
        synchronized (BlockExtendThread.class){
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖票了，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

class MyThread523_2{
    public static void main(String[] args) {
        BlockExtendThread blockExtendThread1 = new BlockExtendThread();
        BlockExtendThread blockExtendThread2 = new BlockExtendThread();
        BlockExtendThread blockExtendThread3 = new BlockExtendThread();

        blockExtendThread1.start();
        blockExtendThread2.start();
        blockExtendThread3.start();


    }

}

