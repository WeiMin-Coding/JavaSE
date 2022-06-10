package com.weimin.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 本类用于测试异常的入门案例
 */
public class Test1_ExceptionDemo {
    public static void main(String[] args) throws Exception {
        // method1();
        // method2();
        method3();
    }

    public static void method1() {
        System.out.print("请输入需要计算的第一个数字：");
        int inputNumber1 = new Scanner(System.in).nextInt();
        System.out.print("请输入需要计算的第二个数字：");
        int inputNumber2 = new Scanner(System.in).nextInt();

        System.out.println("结果为: " + (inputNumber1 / inputNumber2));
    }

    public static void method2() {
        try {
            System.out.print("请输入需要计算的第一个数字：");
            int inputNumber1 = new Scanner(System.in).nextInt();
            System.out.print("请输入需要计算的第二个数字：");
            int inputNumber2 = new Scanner(System.in).nextInt();
            System.out.println("结果为: " + (inputNumber1 / inputNumber2));
        } catch (InputMismatchException e) {
            System.out.println("输入的类型不正确");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (Exception E) {
            System.out.println("请输入正确的整数");
        }
    }

    public static void method3() throws Exception{
        System.out.print("请输入需要计算的第一个数字：");
        int inputNumber1 = new Scanner(System.in).nextInt();
        System.out.print("请输入需要计算的第二个数字：");
        int inputNumber2 = new Scanner(System.in).nextInt();
        System.out.println("结果为: " + (inputNumber1 / inputNumber2));
    }
}
