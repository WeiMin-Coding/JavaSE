package com.weimin.thread;

public class Test4_SaleTickets2 {
    public static void main(String[] args) {
        TicketThread2 t = new TicketThread2();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }

}

class TicketThread2 implements Runnable {
    static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            tickets --;
            System.out.println("剩余票数:" + tickets + " " + Thread.currentThread().getName());
            if (tickets <= 0) break;
        }
    }
}