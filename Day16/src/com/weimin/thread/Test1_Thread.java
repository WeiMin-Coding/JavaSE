package com.weimin.thread;

/**
 * 本类用于测试多线程实现方案一
 */
public class Test1_Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread("T3");
        // t.run();
        // t2.run();

        t.start();
        t2.start();
        t3.start();
    }
}

class MyThread extends Thread {
    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "=" + getName());
        }
    }
}