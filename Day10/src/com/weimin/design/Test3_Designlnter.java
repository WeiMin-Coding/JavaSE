package com.weimin.design;

/**
 * 本类用于改造老师设计案例，采用面向接口编程
 */
public class Test3_Designlnter {
    public static void main(String[] args) {
        CGBTeacher weimin = new CGBTeacher();
        weimin.study();
        weimin.teach();

    }
}

interface Teacher {
    public abstract void study();

    public abstract void teach();
}

class CGBTeacher implements Teacher {
    @Override
    public void study() {
        System.out.println("正在备课...电商项目");
    }

    @Override
    public void teach() {
        System.out.println("正在讲课...电商项目");
    }
}

abstract class SCDTeacher implements Teacher {

}