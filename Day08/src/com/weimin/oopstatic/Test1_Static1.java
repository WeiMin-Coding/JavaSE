package com.weimin.oopstatic;

/**
 * 本类用于测试静态的入门案例
 */
public class Test1_Static1 {
    public static void main(String[] args) {
        System.out.println(Student.name);
        Student.study();

        Student s = new Student();
        s.name = "韦民";
        System.out.println(s.name);
        s.speak();
        s.study();

        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(Student.name);
    }
}

class Student {
    int sno;
    static String name;

    public static void study() {
        System.out.println("学习JAVA");
    }

    public void speak() {
        System.out.println("大声说出来");
    }
}
