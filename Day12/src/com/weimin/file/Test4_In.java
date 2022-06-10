package com.weimin.file;

import java.io.*;

/**
 * 本类用于测试文件的读取
 */
public class Test4_In {
    public static void main(String[] args) {
        // method1("D:\\ready\\1.txt");
        method2("D:\\ready\\1.txt");
    }

    public static void method1(String path) {
        InputStream in = null;

        try {
            // in = new FileInputStream(new File(path));
            in = new FileInputStream(path);

            // Add Code
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

    public static void method2(String path) {
        BufferedInputStream in = null;

        try {
            in = new BufferedInputStream(new FileInputStream(path));

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
