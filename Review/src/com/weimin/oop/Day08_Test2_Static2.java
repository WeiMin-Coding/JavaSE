package com.weimin.oop;

public class Day08_Test2_Static2 {
    String name;

    public void teach() {
        System.out.println();
    }

    static int age;

    public static void eat() {
        System.out.println("Teacher.eat()");
    }

    public static void sleep() {
        // System.out.println(this.name);
        // this.teach();
        System.out.println(age);
        eat();

    }
}
