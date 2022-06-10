package com.weimin.out;

import java.io.*;

/**
 * 本类用来测试字节输出流
 */
public class Test1_1 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        OutputStream out = null;

        try {
            // out = new FileOutputStream(new File("D:\\ready\\1.txt"));
            out = new FileOutputStream("D:\\ready\\1.txt");
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

    private static void method2() {
        OutputStream out = null;

        try {
            out = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
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
}
