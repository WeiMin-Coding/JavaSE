package com.weimin.array;

import java.util.Arrays;

public class Test5_BubbleSort {
    public static void main(String[] args) {
        int[] a = {27, 96, 73, 25, 21};
        method(a);
        //method2(a);
        System.out.println(Arrays.toString(a));
    }

    public static void method(int[] a) {
        for (int i = a.length - 1; 0 <= i; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void method2(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

}
