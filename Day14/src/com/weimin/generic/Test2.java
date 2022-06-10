package com.weimin.generic;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String[] str = {"WeiMin", "Hello"};
        Integer[] i1 = {1, 2, 3 ,4 ,5};
        Double[] d1 = {1.1, 2.2, 3.3, 4.4};

        print(str);
        print(i1);
        print(d1);
    }

//    public static void print(String[] strings) {
//        for (String str : strings) {
//            System.out.println(str);
//        }
//    }
//
//    public static void print(Integer[] integer) {
//        for (Integer i : integer) {
//            System.out.println(i);
//        }
//    }
//
//    public static void print(Double[] d) {
//        for (Double d1 : d) {
//            System.out.println(d1);
//        }
//    }

    public static <E> void print(E[] e) {
        for (E element : e) {
            System.out.println(element);
        }
    }
}
