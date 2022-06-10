package com.weimin.oopextends;

/**
 * 本类是继承的入门案例
 */
public class Test5_ExtendsDemo {
    public static void main(String[] args) {
        Dog ww = new Dog();
        ww.eat();
        System.out.println(ww.a);

        Cat c = new Cat();
        c.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("吃啥都行~");
    }
}

class Cat extends Animal {
    int a = 10;
    private int b = 200;
}

class Dog extends Cat {

}
