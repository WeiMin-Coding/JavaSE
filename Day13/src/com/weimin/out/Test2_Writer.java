package com.weimin.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2_Writer {
    public static void main(String[] args) {
        // method1("D:\\ready\\1.txt");
        method2("D:\\ready\\1.txt");
    }

    public static void method1(String path) {
        Writer out = null;

        try {
            out = new FileWriter(path, true);

            out.write(97);
            out.write(98);
            out.write(99);
            out.write("Hello");
            out.write("Die");
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void method2(String path) {
        Writer out = null;

        try {
            out = new BufferedWriter(new FileWriter(path, true));

            out.write(97);
            out.write("Hello");
            out.write(" IO");
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
