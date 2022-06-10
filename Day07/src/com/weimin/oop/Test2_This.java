package com.weimin.oop;

/**
 * 本类用于this测试
 * 当一个类中有两个同名的变量,一个成员变量,一个局部变量
 * 想使用本类的成员变量时,可以用this指定一下
 * this代表的就是"本类",成员变量属于类
 */
public class Test2_This {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}

class Cat {
    int sum = 20;
    int s = 30;

    public void eat() {
        int sum = 10;
        System.out.println(sum);
        System.out.println(s);

        System.out.println(this.sum);
    }
}
