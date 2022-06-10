package com.weimin.oopextends;

/**
 * 本类用于测试继承中构造方法的使用
 */
public class Test8_Extends3 {
    public static void main(String[] args) {
        Son3 s = new Son3();
    }
}

class Father3 {
    public Father3() {
        System.out.println("Father3的无参构造");
    }

    public Father3(String s) {
        this();
        System.out.println("Father3的有参构造 " + s);
    }

    public void eat() {
        System.out.println("吃啥都行");
    }
}

class Son3 extends Father3 {
    public Son3() {
        super("韦民");
        System.out.println("我是子类的无参构造");
    }

    public void cat() {
        super.eat();
    }
}

