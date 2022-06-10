package com.weimin.collection2;

import java.util.HashSet;

/**
 * 本类用于HashSet测试
 */
public class Test2_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(200);
        set.add(300);
        set.add(300);

        System.out.println(set);
    }
}

