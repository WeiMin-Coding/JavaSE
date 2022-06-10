package com.weimin.basic;

/**
 * 本类用于测试嵌套for循环
 */
public class Test1_ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.println(i + " " + j);
            }
        }

        System.out.println("**********打印矩形**********");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
