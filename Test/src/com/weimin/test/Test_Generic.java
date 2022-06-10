package com.weimin.test;

import java.util.ArrayList;

public class Test_Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();

        String name = "We";
        Double d1 = 2.2;
        double d2 = 2.3;
        Integer i1 = 11111;
        char c1 = 'a';
        print(name);
        print(d1);
        print(d2);
        print(i1);
        print(c1);
    }

    public static <E> void print(E e) {
        System.out.println(e);
    }
}

