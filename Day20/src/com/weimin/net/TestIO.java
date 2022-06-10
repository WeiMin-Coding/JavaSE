package com.weimin.net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class TestIO {
    public static void main(String[] args) throws Exception {
        // method1();
        // method2("123");
        // method2("");
        method3("D:\\ready\\1.txt", "D:\\ready\\2.txt");
    }

    public static void method1() throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("D:\\ready\\1.txt"));
        String data;
        while ((data = in.readLine()) != null) {
            method2(data);
        }
    }

    public static void method2(String data) throws Exception {
        PrintWriter out = new PrintWriter("D:\\ready\\2.txt");
        out.println(data);
        out.close();
    }

    public static void method3(String source, String target) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(source));
        PrintWriter out = new PrintWriter(target);
        String data;
        while ((data = in.readLine()) != null) {
            out.println(data);
        }
        out.close();
        in.close();
    }
}
