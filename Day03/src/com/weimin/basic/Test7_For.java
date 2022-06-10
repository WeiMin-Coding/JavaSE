package com.weimin.basic;

/**
 * 本类用于测试for循环
 */
public class Test7_For {
    public static void main(String[] args) {
        // 需求:打印0到10
        for (int i=0;i<=10;i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("**********************");

        // 需求:打印10-0
        for (int i=10;i>=0;i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("**********************");

        // 需求:打印8,88,888,8888
        for (int i=8;i<=8888;i=(i*10)+8) {
            System.out.print(i + " ");
        }
    }
}
