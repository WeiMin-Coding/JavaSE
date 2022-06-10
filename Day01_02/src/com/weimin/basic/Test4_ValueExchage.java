package com.weimin.basic;

import java.util.Scanner;

/**
 * 需求:接收用户输入的两个值,假设a=2,b=1,并将这两个变量的值进行互换
**/
public class Test4_ValueExchage {
    public static void main(String[] args) {
        int c;

        System.out.print("请输入变量a的值: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("请输入变量b的值: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("变量转换中......");

        c = a;
        a = b;
        b = c;

        System.out.println("变量a: " + a);
        System.out.println("变量b: " + b);
    }
}
