package com.xzz.day18;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 徐正洲
 * @date 2022/5/23-20:42
 */
public class ThreadTrain {
    public static void main(String[] args) {
        Account account = new Account(0);
        Train train = new Train(account);
        Thread thread1 = new Thread(train);
        Thread thread2 = new Thread(train);
        thread1.start();
        thread2.start();

    }
}

class Train implements Runnable {
    private Account account;

    public Train(Account account) {
        this.account=account;
    }

    @Override
    public void run() {
//        synchronized (this){
            for (int i = 0; i < 3; i++) {
                account.setBalance(1000);
            }
//        }
    }
}

class Account {
    private double balance;
    ReentrantLock lock = new ReentrantLock();

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        lock.lock();
        try {
            this.balance += balance;
            System.out.println("余额为：" + this.balance);
        } finally {
            lock.unlock();
        }
    }
}
