package com.weimin.oopextends;

/**
 * 本类用于测试继承中成员变量的使用
 */
public class Test6_Extends1 {
    public static void main(String[] args) {
        Son s = new Son();
        s.eat();
    }
}

class Father {
    int count = 0;
    int sum = 300;
}

class Son extends Father {
    int sum = 100;

    public void eat() {
        int sum = 10;
        System.out.println(sum);
        System.out.println(this.sum);
        System.out.println(count);
        System.out.println(super.sum);
    }
}