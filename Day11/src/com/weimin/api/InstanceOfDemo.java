package com.weimin.api;

public class InstanceOfDemo {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b instanceof Object);
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
        System.out.println(b instanceof C);
    }
}

class A {

}

class B extends A {

}

class C extends B {

}