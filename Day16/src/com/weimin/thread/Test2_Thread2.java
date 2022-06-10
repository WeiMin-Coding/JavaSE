package com.weimin.thread;

public class Test2_Thread2 {
    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
        Thread t = new Thread(target, "t1");
        Thread t2 = new Thread(target, "t2");
        Thread t3 = new Thread(target, "t3");
        t.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "=" + Thread.currentThread().getName());
        }
    }
}

