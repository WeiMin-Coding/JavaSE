package com.weimin.oopextends;

/**
 * 本类用于测试继承中成员方法的使用
 */
public class Test7_Extends2 {
    public static void main(String[] args) {
        Son2 s = new Son2();
        s.eat();
        s.study();

        Father2 f = new Father2();
        f.eat();
    }
}

class Father2 {
    public void eat() {
        System.out.println("爸爸爱吃肉");
    }
}

class Son2 extends Father2 {
    public void eat() {
        System.out.println("儿子爱吃饺子");
    }

    public void study() {
        System.out.println("来学习JAVA");
    }
}
