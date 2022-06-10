package com.weimin.seri;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("D:\\ready\\obj"));

            Student weimin = new Student("WeiMin", 1, "M", "广西南宁");
            out.writeObject(weimin);
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

    public static void method2() {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("D:\\ready\\obj"));

            Student weimin = (Student) in.readObject();

            System.out.println(weimin);
        } catch (Exception e) {
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
