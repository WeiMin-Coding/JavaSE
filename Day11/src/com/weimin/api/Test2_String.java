package com.weimin.api;

import java.util.Arrays;
import java.util.Locale;

/**
 * 本类用于测试String API
 */
public class Test2_String {
    public static void main(String[] args) {
        char[] data = {'a', 'b', 'c'};
        String str = new String(data);

        String str2 = "abc";

        System.out.println(str.equals(str2));
        System.out.println(str2.charAt(1));
        System.out.println(str2.endsWith("c"));
        System.out.println(str2.equals(str));

        String str3 = str2.concat("cxy");
        System.out.println(str3.getBytes());
        System.out.println(str3.indexOf("c"));
        System.out.println(str3.lastIndexOf("c"));
        System.out.println(str3.length());

        str3 = "a b c d e";
        System.out.println(str3.split(" "));
        System.out.println(Arrays.toString(str3.split(" ")));
        System.out.println(str3.startsWith("a"));
        System.out.println(str3.substring(1));
        System.out.println(str3.substring(2, 5));

        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        str3 = "     abc     ";
        System.out.println(str3.trim());

        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(10) + 10);
    }
}
