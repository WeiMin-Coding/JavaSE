package com.weimin.inter2;

/**
 * 本类用于进一步测试接口的使用
 */
public class Test2_UserInter {
    public static void main(String[] args) {
        Inter2 i = new Inter2Impl();
        System.out.println(Inter2.age);
    }
}

interface Inter2 {
    int age = 10;

    public abstract void eat();
    public abstract void play();
    void eat2();
    abstract void eat3();

}

class Inter2Impl implements Inter2 {
    public Inter2Impl() {
        super();
        System.out.println("我是Inter2Impl的无参构造");
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void eat2() {

    }

    @Override
    public void eat3() {

    }
}
