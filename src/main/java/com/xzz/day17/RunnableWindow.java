package com.xzz.day17;

/**
 * @author 徐正洲
 * @date 2022/5/22-19:55
 * 实现runnable接口 多窗口卖票
 */
public class RunnableWindow implements Runnable {
    private int ticket=100;
    @Override
    public void run() {
        while (true){
            if (ticket >0){
                System.out.println(Thread.currentThread().getName() + "窗口卖票了，票号为" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
class MyThread1{
    public static void main(String[] args) {
        RunnableWindow runnableWindow = new RunnableWindow();
        Thread thread1 = new Thread(runnableWindow);
        Thread thread2 = new Thread(runnableWindow);
        Thread thread3 = new Thread(runnableWindow);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}

