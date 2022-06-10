package com.weimin.out;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test1_OutputStream {
    public static void main(String[] args) {
        // method1("D:\\ready\\1.txt");
        method2("D:\\ready\\1.txt");
    }

    public static void method1(String path) {
        OutputStream out = null;

        try {
            out = new FileOutputStream(path);

            out.write(97);
            out.write(98);
            out.write(99);
        } catch (IOException e) {
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
        OutputStream out = null;

        try {
            out = new BufferedOutputStream(new FileOutputStream(path));

            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
        } catch (IOException e) {
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
