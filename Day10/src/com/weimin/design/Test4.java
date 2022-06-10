package com.weimin.design;

public class Test4 {
    public static void main(String[] args) {
        Inter3Impl i = new Inter3Impl();
        i.find();

        Inter3 i2 = new Inter3Impl();
        i2.update();
    }
}

interface Inter1 {
    public abstract void save();

    public abstract void delete();
}

interface Inter2 {
    public abstract void update();

    public abstract void find();
}

interface Inter3 extends Inter1, Inter2 {

}

class Inter3Impl implements Inter3 {

    @Override
    public void save() {
        System.out.println("稍等，正在保存中");
    }

    @Override
    public void delete() {
        System.out.println("删除成功！");
    }

    @Override
    public void update() {
        System.out.println("更新成功");
    }

    @Override
    public void find() {
        System.out.println("正在查询中...");
    }
}