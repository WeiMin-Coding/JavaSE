package com.weimin.oopexec;

/**
 * 本类用于完成OOP汽车设计综合案例
 */
public class Test7_ExtendsDesignCar {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getColor());
        c.start();
        c.stop();

        BMW b = new BMW();
        System.out.println(b.color);
        b.start();
        b.stop();

        BSJ j = new BSJ();
        System.out.println(j.color);
        j.start();
        j.stop();
    }
}

class Car {
    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println("我的车车启动啦~~~");
    }

    public void stop() {
        System.out.println("哎呀吗,我的车车熄火了~");
    }
}

class BMW extends Car {
    String color = "五彩斑斓的黑";

    @Override
    public void start() {
        super.start();
        System.out.println("宝马启动加速度");
    }
}

class BSJ extends Car {
    String color = "五彩斑斓的黑";

    @Override
    public void stop() {
        System.out.println("保时捷想停的稳当些~");
    }
}
