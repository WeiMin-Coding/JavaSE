package com.weimin.oop;

public class Day08_Test1_Static1 {
    public static void main(String[] args) {
        Student.speak();
        System.out.println(Student.count);

        Student weimin = new Student();
        weimin.speak();
        weimin.count = 666;

        Student weimin2 = new Student();
        System.out.println(weimin2.count);
    }
}

class Student {
    static int count = 100;
    int sum = 200;

    public void study() {
        System.out.println("Student.study()");
    }

    public static void speak() {
        System.out.println("Student.speak()");
    }
}