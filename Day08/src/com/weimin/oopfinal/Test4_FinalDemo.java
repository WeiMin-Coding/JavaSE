package com.weimin.oopfinal;

/**
 * 本类用于测试final的入门案例
 */
public class Test4_FinalDemo {
    public static void main(String[] args) {
        Son4 s4 = new Son4();
        s4.work();
        System.out.println(s4.name);
    }
}

class Father4 {
    final String name = "打工人";

    final public void work() {
        System.out.println("Father4 打工人,打工魂");
    }
}

class Son4 extends Father4 {

}