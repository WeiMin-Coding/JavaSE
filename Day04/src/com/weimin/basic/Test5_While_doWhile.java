package com.weimin.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * 本类用于练习while循环
 * 需求: 产生一个随机数,和用户一直在输入的数字做比较,直到用户猜对
 */
public class Test5_While_doWhile {
    public static void main(String[] args) {
        int random = createNum();

        // guessNum1(random);
        guessNum2(random);
    }

    public static void guessNum1(int random) {
        while (true) {
            System.out.print("请输入数字:");
            int inputNumber = new Scanner(System.in).nextInt();
            if (inputNumber == random) {
                System.out.println("恭喜,猜对了!");
                break;
            }

            if (inputNumber < random) {
                System.out.println("小了");
            } else {
                System.out.println("大了");
            }
        }
    }

    public static void guessNum2(int random) {
        do {
            System.out.print("请输入数字:");
            int inputNumber = new Scanner(System.in).nextInt();
            if (inputNumber == random) {
                System.out.println("恭喜,猜对了!");
                break;
            }

            if (inputNumber < random) {
                System.out.println("小了");
            } else {
                System.out.println("大了");
            }
        } while (true);
    }

    public static int createNum() {
        // 普通写法
        // int random = new Random().nextInt(100);
        // return random;

        // 简写
        return new Random().nextInt(100);
    }
}
