package com.weimin.oop;

public class Day08_Test4_FinalDemo {
    public static void main(String[] args) {
        Son3 son3 = new Son3();
        son3.work();
        System.out.println(son3.name);
    }
}

class Father3 {
    final String name = "WeiMin";

    final public void work() {
        System.out.println("打工人");
    }

    public void work2() {
        System.out.println("打工人");
    }
}

class Son3 extends Father3 {
    public void play() {
        System.out.println(super.name);
        // super.name = "213";
    }

    @Override
    public void work2() {
        System.out.println("打工人");
    }
}