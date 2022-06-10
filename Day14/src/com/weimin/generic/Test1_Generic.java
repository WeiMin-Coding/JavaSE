package com.weimin.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用于测试泛型的优点
 */
public class Test1_Generic {
    public static void main(String[] args) {
        String[] a = new String[5];
        a[0] = "WeiMin";
        a[1] = "Hello";
        // a[2] = 2.2;

        List list = new ArrayList();
        list.add("WeiMin");
        list.add(1);
        list.add(8.8);
        list.add('c');

        List<String> list2 = new ArrayList<String>();
    }
}
