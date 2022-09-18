package com.xzz.day19;

/**
 * @author 徐正洲
 * @date 2022/5/24-19:24
 * <p>
 * 生产者、消费者
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        producer.setName("生产者");
        Consumer consumer = new Consumer(clerk);
        consumer.setName("消费者");
        producer.start();
        consumer.start();

    }
}

class Clerk {
    private int num = 0;

    //生产产品
    public synchronized void produceProduct() {
        if (num < 20) {
            num++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + num + "个产品");
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    //消费产品
    public synchronized void consumerProduct() {
        if (num >0){
            System.out.println(Thread.currentThread().getName() + "开始消费第" + num + "个产品");
            num--;
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始生产产品！！！");
        while (true) {
            clerk.produceProduct();
        }


    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("开始消费产品！！！");
        while (true) {
            clerk.consumerProduct();
        }
    }
}