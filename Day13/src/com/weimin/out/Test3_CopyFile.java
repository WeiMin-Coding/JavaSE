package com.weimin.out;

import java.io.*;

/**
 * 本类用于IO综合练习:文件复制
 * 需求:接收用户输入的文件路径来复制,复制到用户指定的路径下
 */
public class Test3_CopyFile {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        copyFile("D:\\ready\\637993 Python Linux系统管理与自动化运维(1).pdf", "D:\\ready\\test.pdf");
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }

    public static void copyFile(String sourcePath, String targetPath) {
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream(sourcePath));
            out = new BufferedOutputStream(new FileOutputStream(targetPath));

            int b;
            byte[] bs = new byte[8 * 1024];
            while ((b = in.read(bs)) != -1) {
                // Add you code
                out.write(bs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
