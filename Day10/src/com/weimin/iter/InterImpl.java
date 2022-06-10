package com.weimin.iter;

/**
 * 本类作为Inter接口的实现类
 */
public class InterImpl implements Inter {
    @Override
    public void eat() {
        System.out.println("今天吃火锅");
    }

    @Override
    public void play() {
        System.out.println("玩啥玩，写代码吧！");
    }
}
