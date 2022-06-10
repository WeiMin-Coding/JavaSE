package com.weimin.reflection;

/**
 * 本类作为测试暴力反射的物料类
 */
public class Person {
    // 1.定义私有属性
    private String name;
    private int age;

    // 2.定义私有方法
    private void update() {
        System.out.println("update()....");
    }

    private void save(String name, int age) {
        System.out.println(name + " save()... " + age);
    }
}

