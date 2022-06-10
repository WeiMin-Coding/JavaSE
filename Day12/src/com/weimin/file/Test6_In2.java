package com.weimin.file;

import java.io.*;

/**
 * 本类用于测试字符流读取
 */
public class Test6_In2 {
    public static void main(String[] args) {
        // method1("D:\\ready\\1.txt");
        method2("D:\\ready\\1.txt");
    }

    public static void method1(String path) {
        Reader input = null;

        try {
            input = new FileReader(path);

            int b;
            while ((b = input.read()) != -1) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void method2(String path) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(path));

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
}
