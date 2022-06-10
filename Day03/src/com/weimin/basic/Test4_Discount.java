package com.weimin.basic;

import java.util.Scanner;

/**
 * 需求: 接收用户输入的原价。满1000打9折;满2000打8折;满5000打5折
 */
public class Test4_Discount {
    public static void main(String[] args) {
        System.out.print("请输入商品总价: ");
        double price = new Scanner(System.in).nextDouble();
        double result = price;

        if (price >= 5000) {
            result = price * 0.5;
        } else if (price >= 2000) {
            result = price * 0.8;
        } else if (price >= 1000) {
            result = price * 0.9;
        }

        System.out.println("结算价格: " + result);
    }
}
