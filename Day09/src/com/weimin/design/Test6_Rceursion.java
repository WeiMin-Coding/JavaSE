package com.weimin.design;

/**
 * 本类用于测试递归
 */
public class Test6_Rceursion {
    public static void main(String[] args) {
        int result = method(5);
        System.out.println(result);
    }

    public static int method(int number) {
        if (number == 1) {
            return 1;
        }
        return number * method(number - 1);
    }
}
