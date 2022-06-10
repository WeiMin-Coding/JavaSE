package com.weimin.file;

import java.io.File;

/**
 * 本类用来递归求目录总大小
 */
public class Test3_FileSumRecursion {
    public static void main(String[] args) {
        long size = method1("D:\\ready");
        System.out.println(size);
    }

    public static long method1(String path) {
        long size = 0;
        File file = new File(path);
        File[] fileLists = file.listFiles();

        for (int i = 0; i < fileLists.length; i++) {
            if (fileLists[i].isFile()) {
                size += fileLists[i].length();
            } else if (fileLists[i].isDirectory()) {
                size += method1(fileLists[i].toString());
            }
        }

        return size;
    }
}
