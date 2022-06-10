package com.weimin.api;

public class Test3_String2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        String s = "abcdefghijklmopqrstuvwxyz";
        String result = "";

        long t1 = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            result += s;
        }
        long t2 = System.currentTimeMillis();

        System.out.println("总长度: " + result.length() + " 花费时间: " + (t2 - t1));
    }

    public static void method2() {
        String s = "abcdefghijklmopqrstuvwxyz";
        StringBuffer result = new StringBuffer();
        StringBuilder result2 = new StringBuilder();

        long t1 = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            result.append(s);
        }
        long t2 = System.currentTimeMillis();

        System.out.println("总长度: " + result.length() + " 花费时间: " + (t2 - t1));
    }
}
