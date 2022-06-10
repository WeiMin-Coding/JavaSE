package com.weimin.oopstatic;

/**
 * 本类用于多态中的元素测试
 */
public class Test6_DuoTai {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        System.out.println(d.sum);
        d.eat();
        d.play();

        Animal2 a = new Dog2();
        System.out.println(a.sum);
        a.eat();
        a.play();
    }
}

class Animal2 {
    int sum = 10;

    public void eat() {
        System.out.println("吃啥都行");
    }

    public static void play() {
        System.out.println("玩啥都行");
    }
}

class Dog2 extends Animal2 {
    int sum = 20;

    @Override
    public void eat() {
        System.out.println("小狗要吃肉骨头");
    }

    public static void play() {
        System.out.println("小狗爱打滚儿~~~");
    }
}
