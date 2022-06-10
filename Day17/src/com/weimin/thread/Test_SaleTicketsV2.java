package com.weimin.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 本类用于改造售票案例，用于解决多线程编程安全问题
 * 需求：4个线程同时买票，共计卖票100张
 * 问题：
 * 1.重卖：一张票卖给了多个人
 * 2.超卖：卖出了0 -1 -2 张票
 */
public class Test_SaleTicketsV2 {
    public static void main(String[] args) {
        SaleTicketV2 target = new SaleTicketV2();

//        Thread t1 = new Thread(target);
//        Thread t2 = new Thread(target);
//        Thread t3 = new Thread(target);
//        Thread t4 = new Thread(target);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            pool.execute(target);
        }
    }
}

class SaleTicketV2 implements Runnable {
    static int tickets = 100;
    Object obj = new Object();

    @Override
    synchronized public void run() {
        while (true) {
            //synchronized (obj) {
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                tickets--;
                System.out.println("当前票数: " + tickets + " " + Thread.currentThread().getName());
            }

            if (tickets <= 0) break;
            //}
        }
    }
}
