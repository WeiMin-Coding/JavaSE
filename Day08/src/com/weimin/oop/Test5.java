package com.weimin.oop;

/**
 * 本类用于测试多态
 */
public class Test5 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Cat c = new Cat();
        c.eat();
        c.jump();

        Animal a2 = new Cat();
        Animal a3 = new Dog();
        a2.eat();
        a3.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("小动物Animal 吃啥都行");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("小猫Cat爱吃小鱼干!");
    }

    public void jump() {
        System.out.println("小猫Cat跳的老高了");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("小狗爱吃肉骨头");
    }
}
