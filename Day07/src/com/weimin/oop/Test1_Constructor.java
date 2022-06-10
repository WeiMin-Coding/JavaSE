package com.weimin.oop;

/**
 * 本类用于测试构造方法
 */
public class Test1_Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("WeiMin");
        Person p3 = new Person("WeiMin", 555, "火星");
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.address);
        p1.study();

        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println(p3.address);
        p3.study();
    }
}

class Person {
    String name;
    int age;
    String address;

    public Person() {
        System.out.println("无参构造");
    }

    public Person(String s) {
        System.out.println("有参构造 " + s);
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void study() {
        System.out.println("又是美好的一天!");
    }
}
