package com.weimin.design;

/**
 * 本类用于设计老师类，面对对象编程
 */
public class Test5_Design {
    public static void main(String[] args) {
        CGBTeacher cgb_WeiMin = new CGBTeacher();
        SCDTeacher scd_WeiMin = new SCDTeacher();

        cgb_WeiMin.ready();
        cgb_WeiMin.study();

        scd_WeiMin.ready();
        scd_WeiMin.study();
    }
}


abstract class Teacher {
    int id;
    String name;

    public abstract void ready();

    public abstract void study();
}

class CGBTeacher extends Teacher {

    @Override
    public void ready() {
        System.out.println("正在备课...电商项目");
    }

    @Override
    public void study() {
        System.out.println("正在讲课...电商项目");
    }
}

class SCDTeacher extends Teacher {

    @Override
    public void ready() {
        System.out.println("正在备课...hadoop");
    }

    @Override
    public void study() {
        System.out.println("正在讲课...spark");
    }
}