package com.weimin.block;

/**
 * 本类用于测试静态代码块
 */
public class Test3_Block {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(Person.name);
        Person p2 = new Person();
        p2.study();
    }
}

class Person {
    static String name;

    static {
        name = "WeiMin";
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public Person() {
        System.out.println("构造方法");
    }

    public void study() {
        System.out.println("普通方法");
    }
}
