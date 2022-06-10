package com.weimin.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 本类用于练习数组的遍历
 * 需求:输出一年中每个月份的天数
 * 遍历数组，存入1到10
 */
public class Test4_ArrayExec {
    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    public static void method() {
        int[] month = {31, 28, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        for (int i = 0; i <= month.length - 1; i++) {
            System.out.println(month[i]);
        }
    }

    public static void method2() {
        int[] a = new int[10];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = i + 1;
        }
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }

    public static void method3() {
        int[] a = new int[10];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = new Random().nextInt(100);
        }
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }
}
