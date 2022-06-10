package com.weimin.game;

/**
 * 本类用于进行士兵类的测试
 */
public class Test1 {
    public static void main(String[] args) {
        Soldier weimin = new Soldier();
        weimin.id = 1;
        weimin.blood = 100;
        weimin.go();

        Soldier s1 = new Soldier();
        s1.id = 2;
        s1.blood = 100;
        s1.go();
        for (int i = 1; i <= 100; i++) {
            s1.atack();
        }

        s1.ak47 = new AK47();

    }
}
