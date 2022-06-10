package com.weimin.basic;

import java.util.Scanner;

/**
 * 需求：接收用户输入的年份,判断是平年还是闰年
 * 如果年份是闰年,需要满足下面两个条件之一:
 *  条件1:能被4整除,并且不能被100整除
 *  条件2:能被400整除
 */
public class Test3_Year {
    public static void main(String[] args) {
        System.out.println("请输入年份: ");
        int year = new Scanner(System.in).nextInt();

        String result = "平年";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            result = "闰年";
        }

        System.out.println(result);
    }
}
