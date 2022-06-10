package com.weimin.basic;

import java.util.Scanner;

/**
 * 需求：接收用户输入的两个整数，并比较输出这两个最大的值
 */
public class Test2_MaxNum {
    public static void main(String[] args) {
        System.out.print("请输入第一个整数: ");
        int number1 = new Scanner(System.in).nextInt();

        System.out.print("请输入第二个整数: ");
        int number2 = new Scanner(System.in).nextInt();

        int max = number1 > number2 ? number1 : number2;

        System.out.println("最大值: " + max);
    }
}
