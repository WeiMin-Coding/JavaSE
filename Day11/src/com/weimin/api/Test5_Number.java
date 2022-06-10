package com.weimin.api;

public class Test5_Number {
    public static void main(String[] args) {
        Integer i0;

        Integer i1 = new Integer(10);
        Integer i2 = Integer.valueOf(10);
        Integer i3 = Integer.valueOf(10);

        Integer i4 = Integer.valueOf(300);
        Integer i5 = Integer.valueOf(300);

        System.out.println(i2 == i3);
        System.out.println(i4 == i5);

        Double d1 = new Double(3.4);
        Double d2 = Double.valueOf(3.4);
        Double d3 = Double.valueOf(3.4);


    }
}
