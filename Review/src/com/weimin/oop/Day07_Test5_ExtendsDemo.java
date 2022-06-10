package com.weimin.oop;

public class Day07_Test5_ExtendsDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.jump();
        System.out.println(cat.age);

        DingDing dd = new DingDing();
        dd.eat();
        dd.jump();
        System.out.println(dd.age);
        
    }
}

class Animal {
    public void eat() {
        System.out.println("吃啥都行");
    }
}

class Cat extends Animal {
    int age = 10;
    private int b = 100;

    public void jump() {
        System.out.println("跳");
    }
}

class DingDing extends Cat {

}
