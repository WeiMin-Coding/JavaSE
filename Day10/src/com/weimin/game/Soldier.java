package com.weimin.game;

import java.util.Random;

/**
 * 本类用于封装士兵相关的属性和方法
 */
public class Soldier {
    int id;
    int blood = 100;
    AK47 ak47;

    public void go() {
        System.out.println(this.id + "号士兵在前进");
    }

    public void atack() {
        System.out.println(this.id + "号士兵在进攻");

        int atk = new Random().nextInt(10);
        this.blood -= atk;
        if (this.blood < 0) {
            this.blood = 0;
        }

        System.out.println(this.id + " 剩余血量: " + this.blood);

        if (this.blood == 0) {
            System.out.println(this.id + "号士兵阵亡了");
            return;
        }
    }
}
