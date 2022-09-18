package com.xzz.day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 徐正洲
 * @date 2022/5/24-20:13
 * <p>
 * 创建线程的方式三：Callable接口
 * 1、call方法有返回值
 * 2、call可以抛出异常
 * Callable支持范型。
 */

//1、创建一个实现callable的实现类
class CallableTest implements Callable<Integer> {
//    2、重写call方法
    @Override
    public Integer call() throws Exception {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class MyCallableTest {
    public static void main(String[] args) {
//        3、创建callable实现类对象
        CallableTest callableTest = new CallableTest();
//        4、将实现类传到 futureTask构造器中
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableTest);
//        5、将futureTask对象传给Thread构造器中
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            //get 方法返回值为call返回值。
            Integer sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}