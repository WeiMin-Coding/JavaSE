package com.weimin.oop;

/**
 * 本类用来练习面向对象
 * 分析手机事物:--通过类来描述
 * 属性:品牌 价格 尺寸 颜色
 * 功能:打电话 发短信 听直播
 */
public class Test1_ClassExec {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.message();
        p.learn();

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.size);
        System.out.println(p.color);

        Phone p2 = new Phone();
        p.call();
        p.message();
        p.learn();

        p2.brand = "HUAWEI";
        p2.price = 8888.88;
        p2.size = 5.6;
        p2.color = "中国红";

        System.out.println(p2.brand);
        System.out.println(p2.price);
        System.out.println(p2.size);
        System.out.println(p2.color);
    }
}

class Phone{
    String brand;
    double price;
    double size;
    String color;

    public void call() {
        System.out.println("打电话");
    }

    public void message() {
        System.out.println("发短信");
    }

    public void learn() {
        System.out.println("学习");
    }
}
