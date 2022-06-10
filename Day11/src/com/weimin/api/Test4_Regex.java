package com.weimin.api;

/**
 * 本类用于测试正则表达式
 * 需求:测试输入身份证号,测试用户输入是否正确
 */
public class Test4_Regex {
    public static void main(String[] args) {
        method1("111111111111111111");
    }

    public static void method1(String number) {
        String regex = "[0-9]{18}";
        if (number.matches(regex)) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
