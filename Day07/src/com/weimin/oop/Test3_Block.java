package com.weimin.oop;

/**
 * 本类用于测试代码块的加载顺序
 */
public class Test3_Block {
    public static void main(String[] args) {
        Teacher weimin = new Teacher();
        Teacher t1 = new Teacher("WeiMin", "Java培优");
        System.out.println(weimin.subject);
        System.out.println(t1.name);
        System.out.println(t1.subject);

        weimin.teach();
        weimin.study();
    }
}

class Teacher {
    String name;
    String subject;

    {
        subject = "Java培优";
        System.out.println("构造代码块");
    }

    public Teacher() {
        System.out.println("无参构造");
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        System.out.println("全参构造");
    }

    public void study() {
        {
            int i = 10;
            System.out.println(i);
        }
        System.out.println("正在备课ing");
    }

    public void teach() {
        System.out.println("正在上课ing");
    }
}