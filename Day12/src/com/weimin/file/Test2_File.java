package com.weimin.file;

import java.io.File;
import java.util.Arrays;

/**
 * 本类用于测试文件流
 */

public class Test2_File {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\ready\\1.txt");

        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(file.createNewFile());

        file = new File("D:\\ready\\m");
        System.out.println(file.mkdir());

        file = new File("D:\\ready\\m\\c\\a\\v\\c");
        System.out.println(file.mkdirs());

        file = new File("D:\\ready");

        String[] filelists = file.list();

        System.out.println(Arrays.toString(filelists));

        System.out.println(filelists[0].length());
        System.out.println(filelists[0]);
    }
}
