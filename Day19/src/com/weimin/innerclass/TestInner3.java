package com.weimin.innerclass;

/**
 * 本类用于测试成员内部类被static修饰后的效果
 */
public class TestInner3 {
    public static void main(String[] args) {
        // Outer3.Inner3 oi3 = new Outer3().new Inner3();
        // oi3.play();

        // new Outer3().new Inner3().play();
        Outer3.Inner3 oi3 = new Outer3.Inner3();
        oi3.play();

        new Outer3.Inner3().play();
        Outer3.Inner3.play2();
    }
}

class Outer3 {
    static class Inner3 {
        String name;

        public void play() {
            System.out.println("Inner3_春天应该玩代码");
        }

        public static void play2() {
            System.out.println("Inner3_play2()_春天应该玩代码");
        }
    }
}