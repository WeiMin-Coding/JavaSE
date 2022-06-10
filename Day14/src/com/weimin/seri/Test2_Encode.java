package com.weimin.seri;

import java.io.*;

/**
 * 本类用来测试编码转换流
 */
public class Test2_Encode {
    public static void main(String[] args) {
        OutputStreamWriter out = null;
        try {
            // out = new OutputStreamWriter(new FileOutputStream("D:\\ready\\Encode.txt"), "ISO-8859-1");
            out = new OutputStreamWriter(new FileOutputStream("D:\\ready\\Encode.txt"), "UTF-8");
            out.write("Hello WeiMin");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
