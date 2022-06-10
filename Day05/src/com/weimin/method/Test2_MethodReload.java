package com.weimin.method;

public class Test2_MethodReload {
    public static void main(String[] args) {
        method(1, 2);
        method("韦民", 11);
        method();
        method(12345);
    }

    public static void method(int i, int j) {
        System.out.println(i + j);
    }

    public static void method(String s, int i) {
        System.out.println(s + i);
    }

    public static void method() {
        System.out.println("没有任何参数");
    }

    public static void method(int i) {
        System.out.println(i);
    }
}
