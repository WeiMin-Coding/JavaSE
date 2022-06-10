package com.weimin.array;

import java.util.Arrays;

public class Test3_CreateArray {
    public static void main(String[] args) {
        char[] c1 = {'h', 'e', 'l', 'l', 'o'};
        char[] c2 = new char[] {'h', 'e', 'l', 'l', 'o'};

        char[] c3 = new char[5];
        c3[0] = 'h';
        c3[1] = 'e';
        c3[2] = 'l';
        c3[3] = 'l';
        c3[4] = 'o';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        String[] s1 = {"WeiMin", "@123"};
        String[] s2 = new String[] {"WeiMin", "@123"};
        System.out.println(s1);

        System.out.println(Arrays.toString(s1));

        System.out.println(s1.length);
        System.out.println(c1.length);
    }
}
