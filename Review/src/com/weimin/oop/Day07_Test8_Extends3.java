package com.weimin.oop;

public class Day07_Test8_Extends3 {
    public static void main(String[] args) {
        S s = new S();
    }
}

class F {
    String name;

    public F() {
        System.out.println("父类的无参构造");
    }

    public F(String name) {
        this.name = name;
        System.out.println("父类的全参构造");
    }
}

class S extends F {
    public S() {
        super("WieMIN");
        //this("We");
        System.out.println("子类的无参构造");
    }

    public S(String name) {
        System.out.println(name);
    }
}
