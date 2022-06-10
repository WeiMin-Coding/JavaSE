package com.weimin.api;

import java.util.Objects;

/**
 * 本类用于测试Object的使用
 */
public class Test1_Object {
    public static void main(String[] args) {
        Student s1 = new Student(1, "WeiMin");
        System.out.println(s1);
        System.out.println(s1.hashCode());

        Student s2 = new Student(1, "WeiMin");

        System.out.println(s2.equals(s1));
    }
}

class Student {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student){
            Student argsStudent = (Student) o;
            if (this.age == argsStudent.age && this.name == argsStudent.name) {
                return true;
            }
        }
        return false;
    }

}
