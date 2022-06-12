package com.weimin.oop;

public class Day07_Test7_Extends2 {
    public static void main(String[] args) {
        Son2 son = new Son2();
        son.eat();
        son.study();
    }
}

class Father2 {
    public void eat() {
        System.out.println("Father2 " + " eat()");
    }
}

class Son2 extends Father2 {
    @Override
    public void eat() {
        System.out.println("Son2 eat()");
    }

    public void study() {
        System.out.println("Son2 study()");
    }
}


