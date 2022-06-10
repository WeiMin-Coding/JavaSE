package com.weimin.oopstatic;

/**
 * 本类用于测试静态的调用关系
 */
public class Test2_Static2 {
    public static void main(String[] args) {
        Teacher.eat();
        Teacher.sleep();
    }
}

class Teacher {
    String name;
    static int age;

    public void teach() {
        System.out.println(age);
    }

    public static void eat() {
        System.out.println("吃饭");
    }

    public static void sleep() {
        // System.out.println(name);
        // this.teach();

        System.out.println(age);
        eat();
    }
}
