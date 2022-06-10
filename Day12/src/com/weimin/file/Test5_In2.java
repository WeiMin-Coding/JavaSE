package com.weimin.file;

import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * 本类用于字符流的读取
 */
public class Test5_In2 {
    public static void main(String[] args) {
        method1("D:\\ready\\1.txt");  // 普通字符流读取
        method2("D:\\ready\\1.txt");  // 高效字符流读取
    }

    private static void method1(String path) {
        Reader in = null;
        try {
            in = new FileReader(path);

            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method2(String path) {
        Reader in = null;

        try {
            in = new BufferedReader(new FileReader(path));

            int b;
            while ((b = in.read()) != -1) {
                System.out.println("*************");
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
