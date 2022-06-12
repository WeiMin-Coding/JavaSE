package com.weimin.oop;

public class Day08_Test3_Block {
    public static void main(String[] args) {
        Person weimin = new Person();
        weimin.study();
    }
}

class Person {
    static {
        System.out.println("Person static代码块");
    }

    {
        System.out.println("Person 构造代码块");
    }

    public Person() {

    }

    public void study() {
        {
            System.out.println("局部代码块");
        }
    }
}