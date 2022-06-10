package com.weimin.collection2;

import java.util.HashSet;
import java.util.Set;

public class Test3_HashSet2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("jack", 10000, "jack广西南宁");
        Student s2 = new Student("rose", 10000, "rose广西南宁");
        Student s3 = new Student("tom", 10000, "tom广西南宁");
        Student s4 = new Student("rose", 10000, "rose广西南宁");
        Student s5 = new Student("tom", 10000, "tom广西南宁");

        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println(set);
    }
}
