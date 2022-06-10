package com.weimin.design;

public class OOPTest {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        int result = method1(5);
        System.out.println(result);

        B b = new B();
    }

    public static int method1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * method1(n - 1);
        }
    }
}

class A {
    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类构造代码块");
    }

    public A() {
        System.out.println("父类的构造方法");
    }

    public void eat() {
        System.out.println("父类的方法");
        {
            System.out.println("父类局部代码块");
        }
    }
}

class B extends A {
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    public B() {
        System.out.println("子类的构造方法");
    }

    public void eat() {
        System.out.println("子类的方法");
        {
            System.out.println("子类局部代码块");
        }
    }
}

