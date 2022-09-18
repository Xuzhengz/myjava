package com.xzz.day19;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 徐正洲
 * @date 2022/5/24-20:28
 * <p>
 * 创建线程方式四：
 * 线程池：提前创建好多个线程，放入线程池中，使用时获取，使用完放回池中，实现重复利用。
 * <p>
 * 1、提高响应速度（减少创建新的线程时间）
 * 2、降低资源消耗（重复利用线程池中的线程）
 * 3、便于线程管理（核心池大小、最大线程数、线程没有任务最多保持多长时间后会终止）
 */
public class ThreadPool {
    public static void main(String[] args) {
//        1、提供指定数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        线程池属性
        ThreadPoolExecutor service = (ThreadPoolExecutor)executorService;
        service.setCorePoolSize(15);
        

//        2、执行指定线程的操作
        executorService.execute(new t111());//适合使用 runnable
//        executorService.submit();//适合使用 callable
//        3、关闭线程池
        executorService.shutdown();
    }

}

class t111 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}

