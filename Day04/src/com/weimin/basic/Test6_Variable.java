package com.weimin.basic;

/**
 * 本类用于测试变量的使用
 */
public class Test6_Variable {
    static int count;
    static int sum = 30;

    public static void main(String[] args) {
        int sum = 100;
        System.out.println(sum);
        System.out.println(count);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
