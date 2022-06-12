package com.weimin.oop;

public class Day07_Test6_Extends1 {
    public static void main(String[] args) {
        Son son = new Son();
        son.play();
    }
}

class Father {
    int count = 10;
    int sum = 300;
}

class Son extends Father {
    int sum = 100;

    public void play() {
        int sum = 20;
        System.out.println(sum);
        System.out.println(this.sum);
        System.out.println(super.sum);
        System.out.println(count);
    }
}
