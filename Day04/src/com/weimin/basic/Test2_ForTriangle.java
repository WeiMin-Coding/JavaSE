package com.weimin.basic;

/**
 * 需求:利用for循环,打印左直角三角形
 */
public class Test2_ForTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
