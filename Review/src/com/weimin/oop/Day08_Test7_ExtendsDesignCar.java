package com.weimin.oop;

public class Day08_Test7_ExtendsDesignCar {
    public static void main(String[] args) {

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
        System.out.println("Car.start()");
    }

    public void stop() {
        System.out.println("Car.stop()");
    }
}

class BMW extends Car {
    String color = "黑";

    @Override
    public void start() {
        System.out.println("BMW.start()");
    }
}

class BSJ extends Car {
    String color = "Bai";

    @Override
    public void stop() {
        System.out.println("BSJ.stop()");
    }
}
