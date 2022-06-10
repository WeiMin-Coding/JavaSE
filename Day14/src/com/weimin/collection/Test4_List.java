package com.weimin.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用于测试List接口
 */
public class Test4_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("WeiMin1");
        list.add("WeiMin2");
        list.add("WeiMin3");
        list.add("WeiMin4");
        list.add("WeiMin5");
        list.add("WeiMin6");
        list.add("WeiMin7");
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
