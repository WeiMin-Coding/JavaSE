package com.weimin.oop;

/**
 * 本类用于测试封装
 */
public class Test2_Private {
    public static void main(String[] args) {
        Student weimin = new Student();
        System.out.println(weimin.name);

        weimin.name = "WeiMin";
        weimin.sno = 001;
        System.out.println(weimin.name);
        System.out.println(weimin.sno);

        weimin.setSubject("JavaCGB");
        String subject = weimin.getSubject();
        System.out.println(subject);
    }
}

class Student {
    String name;
    int sno;
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void study() {
        this.eat();
    }

    private void eat() {
        System.out.println("吃满汉全席");
    }
}

