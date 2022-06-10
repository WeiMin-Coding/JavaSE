package com.weimin.basic;

import java.util.Scanner;

/**
 * 需求：找数字88
 * 提示并接受用户输入100次数字，如果不是88，则继续输入，找到88就结束
 */
public class Test4_BreakAndContinue {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("请输入数字: " + i + "次");
            int inputNumber = new Scanner(System.in).nextInt();
            if (inputNumber != 88) {
                System.out.println("很抱歉，再试一次！");
                continue;
            }

            if (inputNumber == 88) {
                System.out.println("恭喜你！");
                break;
            }
        }
    }
}
