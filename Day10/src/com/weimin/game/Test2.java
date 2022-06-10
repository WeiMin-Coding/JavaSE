package com.weimin.game;

import java.util.Scanner;

/**
 * 本类用于循环测试射击类
 */
public class Test2 {
    public static void main(String[] args) {
        AK47 ak47 = new AK47();
        System.out.println("按回车射击，输入reload装载子弹。");

        while (true) {
            String command_String = new Scanner(System.in).nextLine();
            if (command_String.equals("reload")) {
                ak47.reload();
                continue;
            }
            ak47.fire();
        }

    }
}
