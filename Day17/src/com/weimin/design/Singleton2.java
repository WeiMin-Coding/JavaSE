package com.weimin.design;

public class Singleton2 {
    public static void main(String[] args) {
        MySingle2 m1 = MySingle2.getSingle();
        MySingle2 m2 = MySingle2.getSingle();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1 == m2);
    }
}

class MySingle2 {
    private static MySingle2 single;

    private MySingle2() {}

    public static MySingle2 getSingle() {
        if (single == null) {
            single = new MySingle2();
        }
        return single;
    }
}
