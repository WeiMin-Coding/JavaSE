package com.weimin.innerclass;

public class TestInner2 {
    public static void main(String[] args) {
        // Outer2.Inner2 oi = new Outer2().new Inner2();
        // oi.study();
        new Outer2().getInner2();
    }
}

class Outer2 {
    public void getInner2() {
        Inner2 i2 = new Inner2();
        i2.study();
    }

    private class Inner2 {
        public void study() {
            System.out.println("Inner2 1阶段倒计时2天");
        }
    }
}
