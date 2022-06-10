package com.weimin.collection2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 本类用于测试Set接口
 */
public class Test1_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("WeiMin");
        set.add("小笼包");
        set.add("蟹黄包");
        set.add("菠萝包");
        set.add("null");
        set.add(null);

        System.out.println(set);

        // set_.clear();
        System.out.println(set.contains("灌汤包"));
        System.out.println(set.equals("奶黄包"));
        System.out.println(set.hashCode());
        System.out.println(set.isEmpty());
        System.out.println(set.remove(null));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(Arrays.toString(set.toArray()));

        Set<String> set2 = new HashSet<>();

        set2.add("小狮子");
        set2.add("小海豚");
        set2.add("小猫");
        System.out.println(set2);

        System.out.println(set.addAll(set2));
        System.out.println(set);
        System.out.println(set.containsAll(set2));
        System.out.println(set.removeAll(set2));
        System.out.println(set.containsAll(set2));

        set.add("花蝴蝶");
        set2.add("花蝴蝶");

        System.out.println(set.retainAll(set2));
        System.out.println(set.retainAll(set));

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
