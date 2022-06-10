package com.weimin.basic;

import java.util.Scanner;

/**
 * 本类用于继续测试if嵌套
 * 需求:根据分数进行评级,根据分数进行评级90分以上 优秀,80~89 良好,70~79 中等,60~69 及格,60分以下 不及格
 */
public class Test5_ScoreLevel {
    public static void main(String[] args) {
        System.out.print("请输入分数: ");
        double fraction = new Scanner(System.in).nextDouble();
        String result = "";

        if (fraction > 90 && fraction <= 100) {
            result = "优秀";
        } else if (fraction >= 80 && fraction <= 90) {
            result = "良好";
        } else if (fraction >= 70 && fraction <= 79) {
            result = "中等";
        } else if (fraction >= 60 && fraction <= 69) {
            result = "及格";
        } else if (fraction < 60) {
            result = "不及格";
        }

        System.out.println(result);
    }
}
