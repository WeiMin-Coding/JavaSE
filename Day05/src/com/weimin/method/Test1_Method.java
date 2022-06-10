package com.weimin.method;

public class Test1_Method {
    public static void main(String[] args) {
        method();
        method2(8);
        method3(4, 5);
        int result = method4(4, 5);
        System.out.println(result);
    }

    public static void method() {
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }

    public static void method2(int num) {
        System.out.println(num * num);
    }

    public static void method3(int i, int j) {
        System.out.println(i * j);
    }

    public static int method4(int i, int j) {
        return i * j;
    }
}
