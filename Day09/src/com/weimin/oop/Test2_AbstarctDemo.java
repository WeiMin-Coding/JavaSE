package com.weimin.oop;

/**
 * 本类用于测试抽象入门案例
 */
public class Test2_AbstarctDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.fly();
        a.fly2();
    }
}

abstract class Animal {
    public void eat() {
        System.out.println("吃啥都行");
    }

    public void play() {
        System.out.println("玩啥都行");
    }

    public abstract void fly();

    public abstract void fly2();
}

abstract class Pig extends Animal {
    public void test() {
        System.out.println("测试方法");
    }

    public abstract void fly();
}

class Cat extends Animal {
    @Override
    public void fly() {
        System.out.println("子类的方法实现");
    }

    @Override
    public void fly2() {

    }
}
