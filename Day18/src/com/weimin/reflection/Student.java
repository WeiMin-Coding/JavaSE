package com.weimin.reflection;

/**
 * 本类用于测试反射
 */
public class Student {
    // 1.定义成员变量
    public String name;
    public int age;

    // 2.定于构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {}

    // 3.定义成员方法
    public void tell() {
        System.out.println("我有一个小秘密，就不告诉你！");
    }

    // 4.重写toString：为了方便查看对象的属性值
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
