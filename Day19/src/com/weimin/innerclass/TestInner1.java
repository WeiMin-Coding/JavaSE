package com.weimin.innerclass;

/**
 * 本类用于测试内部类入门案例
 */
public class TestInner1 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.get();
        System.out.println(oi.count);

        new Outer().find();
    }
}

class Outer {
    String name;
    int age;

    public void find() {
        System.out.println("Outer_find()");

        Inner in = new Inner();
        System.out.println(in.count);
        in.get();
    }

    class Inner {
        int count = 10;

        public void get() {
            System.out.println("Inner_get()");
            System.out.println(name);
            System.out.println(age);
            find();
        }
    }
}
