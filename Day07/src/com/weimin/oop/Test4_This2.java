package com.weimin.oop;

/**
 * 本类用来测试this
 */
public class Test4_This2 {
    public static void main(String[] args) {
        Dog ww = new Dog();
    }
}

class Dog {
    String name;

    public Dog() {
        this("旺旺");
        System.out.println("无参构造");
    }

    public Dog(String s) {
        System.out.println("含参构造 " + s);
    }
}