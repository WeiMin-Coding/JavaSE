package com.weimin.oop;

public class Day08_Test5 {
    public static void main(String[] args) {
        Animal3 cat = new Cat3();
        System.out.println(cat.toString());
        cat.eat();

    }
}

class Animal3 {
    public void eat() {
        System.out.println("Animal3.eat()");
    }
}

class Cat3 extends Animal3 {
    @Override
    public void eat() {
        System.out.println("Cat3.eat()");
    }

    @Override
    public String toString() {
        return "Cat3{}";
    }
}