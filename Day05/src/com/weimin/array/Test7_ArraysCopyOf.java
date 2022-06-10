package com.weimin.array;

import java.util.Arrays;

public class Test7_ArraysCopyOf {
    public static void main(String[] args) {
        int[] form = {1, 2, 3, 4, 5};

        int[] to = Arrays.copyOf(form, 5);
        System.out.println(Arrays.toString(to));

        int[] to2 = Arrays.copyOf(form, 10);
        System.out.println(Arrays.toString(to2));

        int[] to3 = Arrays.copyOf(form, 3);
        System.out.println(Arrays.toString(to3));

        int[] to4 = Arrays.copyOfRange(form, 2, 4);
        System.out.println(Arrays.toString(to4));
    }
}
