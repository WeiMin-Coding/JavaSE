package com.weimin.coolection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test5_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(0, 666);

        // list.clear();
        System.out.println(list);
        System.out.println(list.contains(200));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(300));
        System.out.println(list.lastIndexOf(300));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(300)));
        // System.out.println(list.remove(300));

        System.out.println(list.set(2, 999));
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

        for (Integer number : list) {
            System.out.println(number);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()) {
            Integer number = integerListIterator.next();
            System.out.println(number);
        }

    }
}
