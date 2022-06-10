package com.weimin.oop;

/**
 * 本类用于进行OOP综合练习
 */
public class Test3_Teacher {
    public static void main(String[] args) {
        Teacher weimin = new Teacher();
        System.out.println(weimin.getName());
        weimin.setName("WeiMin");
        System.out.println(weimin.getName());

        Teacher weimin2 = new Teacher("WeiMin", "男", 26, 20000.00);
        System.out.println(weimin2.getSalary());

        System.out.println(new Teacher().getSalary());
    }
}

class Teacher {
    {
        System.out.println("构造代码块");
    }

    private String name;
    private String gender;
    private int age;
    private double salary;

    public Teacher() {
        System.out.println("无参构造");
    }

    public Teacher(String name, String gender, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


