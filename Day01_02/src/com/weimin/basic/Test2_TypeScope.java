package com.weimin.basic;

/**
 * 本类用于查看基本类型的最大值与最小值
 */
public class Test2_TypeScope {
    public static void main(String[] args) {
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byte类型    最大值:" + byteMax + " 最小值:" + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("short类型    最大值:" + shortMax + " 最小值:" + shortMin);

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("int类型    最大值:" + intMax + " 最小值:" + intMin);

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("long类型    最大值:" + longMax + " 最小值:" + longMin);

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("float类型    最大值:" + floatMax + " 最小值:" + floatMin);

        char c1 = '韦';
        char c2 = 'a';
        char c3 = 95;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
