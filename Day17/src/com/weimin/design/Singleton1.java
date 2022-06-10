package com.weimin.design;

public class Singleton1 {
    public static void main(String[] args) {
        MySingle m1 = MySingle.getMysingle();
        MySingle m2 = MySingle.getMysingle();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1 == m2);
    }
}

class MySingle {
    private static MySingle mysingle = new MySingle();

    private MySingle() {}

    public static MySingle getMysingle() {
        return mysingle;
    }
}
