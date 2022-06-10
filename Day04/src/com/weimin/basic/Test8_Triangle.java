package com.weimin.basic;

/**
 * 打印三角形
 */
public class Test8_Triangle {
    public static void main(String[] args) {
        generate();
    }

    public static void generate() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
