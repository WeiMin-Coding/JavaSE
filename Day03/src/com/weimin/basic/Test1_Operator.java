package com.weimin.basic;

/**
 * 本类用于测试取余和自增自减运算符
 */
public class Test1_Operator {
    public static void main(String[] args) {
        System.out.println(25 / 10);
        System.out.println(25 % 10);

        int a = 1;
        System.out.println("********************");
        System.out.println(a++);
        System.out.println(a);

        int b = 1;
        System.out.println("********************");
        System.out.println(++b);

        int c = 1;
        System.out.println("********************");
        System.out.println(c--);
        System.out.println(c);

        int d = 1;
        System.out.println("********************");
        System.out.println(--d);

        System.out.println(--c-c-c--);
        System.out.println(c);
    }
}
