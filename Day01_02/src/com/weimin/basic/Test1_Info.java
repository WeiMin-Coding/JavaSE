package com.weimin.basic;

/**
 * 需求:在控制台打印:
 * java架构师XXX今年XXX岁,月薪XXX,感慨Java是世界上最好的语言
 */
public class Test1_Info {
    public static void main(String[] args) {
        System.out.println("欢迎来到Java，在这里你是上帝！");

        String name = "WeiMin";
        int age = 26;
        double salary = 20000.00D;

        System.out.println("我叫：" + name);
        System.out.println("Java架构师：" + name + " 年龄：" + age + " 薪资：" + salary);
    }
}
