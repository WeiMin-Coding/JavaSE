package com.weimin.oop;

/**
 * 本类用于测试抽象类中的成员
 */
public class Test4_Abstract3 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.eat();
        apple.eat2();
        apple.clean();
    }
}

abstract class Fruit {
    int sum = 10;
    final String name = "Banana";

    public void eat() {
        System.out.println("吃啥水果都行");
    }

    public abstract void clean();

    public abstract void eat2();
}

class Apple extends Fruit {
    @Override
    public void clean() {
        System.out.println(super.sum);
        super.eat();
    }

    @Override
    public void eat2() {
        System.out.println("苹果还是要洗洗再吃");
    }
}
