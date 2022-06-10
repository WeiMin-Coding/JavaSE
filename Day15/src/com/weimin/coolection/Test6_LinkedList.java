package com.weimin.coolection;

import java.util.LinkedList;

/**
 * 本类用于测试linkedList
 */
public class Test6_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("WeiMin1");
        list.add("WeiMin2");
        list.add("WeiMin3");
        list.add("WeiMin4");
        list.add("WeiMin5");

        System.out.println(list);
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("WeiMin1");
        list2.add("WeiMin2");
        list2.add("WeiMin3");
        list2.add("WeiMin4");

        // 查询系列
        System.out.println(list2.element());
        System.out.println(list2.peek());
        System.out.println(list2.peekFirst());
        System.out.println(list2.getFirst());
        System.out.println(list2.peekLast());
        System.out.println(list2.getLast());

        // 新增系列
        System.out.println(list2.offer("完美世界"));
        System.out.println(list2);
        System.out.println(list2.offerFirst("唐朝"));
        System.out.println(list2.offerLast("清朝"));
        System.out.println(list2);

        // 移除系列
        System.out.println(list2.poll());
        System.out.println(list2.pollFirst());
        System.out.println(list2.pollLast());
        System.out.println(list2);
    }
}
