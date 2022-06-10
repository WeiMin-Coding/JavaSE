package com.weimin.test;

import qr.CreateQR;

public class Qr {
    public static void main(String[] args) {
        String url = "https://www.baidu.com";
        String filename = "D:\\ready\\qr.png";
        CreateQR.make(120, 120, url, filename);
    }
}
