package com.weimin.thread;

public class Test3_SaleTickets1 {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketThread extends Thread {
    static int tickets = 100;

    public TicketThread() {

    }

    public TicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tickets --;
            System.out.println("剩余票数:" + tickets + " " + getName());
            if (tickets <= 0) break;
        }
    }
}