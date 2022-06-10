package com.weimin.game;

import java.util.Random;

/**
 * 本类用于热武器AK47的封装
 */
public class AK47 {
    int bullets = 100;

    public void fire() {
        if (this.bullets == 0) {
            System.out.println("没有子弹就不能开火");
            return;
        }

        int shot = new Random().nextInt(10);
        if (shot > this.bullets) {
            shot = this.bullets;
        }

        this.bullets -= shot;
        for (int i = 1; i <= shot; i++) {
            System.out.print(" 突 ");
        }

        if (this.bullets == 0) {
            System.out.println("弹夹空了");
        }
    }

    public void reload() {
        System.out.println("正在装载子弹");
        this.bullets = 100;
    }

}
