package com.weimin.basic;

import java.util.Scanner;

/**
 * 需求:求出指定半径圆的面积
 * 公式:圆的面积：π*r*r
 */
public class Test3_CircleArea {
    public static void main(String[] args) {
        System.out.print("请输入您要计算的半径: ");
        double r = new Scanner(System.in).nextDouble();

        double circleArea = 3.14 * r * r;
        System.out.println("圆的面积为: " + circleArea);
    }
}
