package com.weimin.basic;

/**
 * 本类用于打印右直角三角形
 */
public class Test7_RightRightTriangle {
    public static void main(String[] args) {
        generate(6);
    }

    public static void generate(int length) {
        for (int i = 1; i <= length; i++) {
            for (int k = length; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
