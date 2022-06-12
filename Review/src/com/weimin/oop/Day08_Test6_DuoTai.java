package com.weimin.oop;

public class Day08_Test6_DuoTai {
    public static void main(String[] args) {
        Animal4 cat4 = new Cat4();
        System.out.println(cat4.sum);
        cat4.eat();
        cat4.play();
    }
}

class Animal4 {
    int sum = 10;

    public void eat() {
        System.out.println("Animal4.eat()");
    }

    public static void play() {
        System.out.println("Animal4.play()");
    }
}

class Cat4 extends Animal4 {
    int sum = 20;

    @Override
    public void eat() {
        System.out.println("Cat4.eat()");
    }

    // @Override
    public static void play() {
        System.out.println("Cat4.play()");
    }
}