package com.weimin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 */
public class Test3_Collection {
    public static void main(String[] args) {
        Collection<Integer> list01 = new ArrayList();

        list01.add(123);
        list01.add(123);
        list01.add(123);
        list01.add(123);
        list01.add(123);
        System.out.println(list01);

        Collection<Integer> list02 = new ArrayList();

        list02.add(1);
        list02.add(2);
        list02.add(3);
        list02.add(300);
        System.out.println(list02);

        list01.addAll(list02);
        System.out.println(list01);

        System.out.println(list01.contains(list02));
        System.out.println(list01.containsAll(list02));
        System.out.println(list01.retainAll(list02));

        System.out.println(list01);
        System.out.println(list02);
        System.out.println(list01.iterator());

        Iterator<Integer> iterator = list01.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
    }
}
