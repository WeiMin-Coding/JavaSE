package com.weimin.oop;

/**
 * 本类用于测试抽象类中构造函数的用法
 */
public class Test3_Abstract2 {
    public static void main(String[] args) {
        Animal2 a = new Pig2();
    }
}

abstract class Animal2 {
    public Animal2(String s) {
        System.out.println("抽象类Animal2的构造函数 " + s);
    }

    public abstract void eat();

    public abstract void play();
}

class Pig2 extends Animal2{
    public Pig2() {
        super("Pig2");
        System.out.println("Pig2的构造方法");
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}


