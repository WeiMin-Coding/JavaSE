package com.weimin.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 本类用于测试暴力反射
 */
public class TestReflect2 {
    // 1.定义单元测试方法getField() 用来获取属性
    @Test
    public void getField() throws Exception {
        Class<Person> personClass = Person.class;
        Field field = personClass.getDeclaredField("name");
        System.out.println(field.getName() + " " + field.getType().getName());

        // 2.设置属性的值，通过反射创建对象
        Person person = personClass.newInstance();

        // 3.暴力反射，设置私有变量可见
        field.setAccessible(true);

        // 给指定对象设置值
        field.set(person, "WeiMin");
        // 获取设置的值
        System.out.println(field.get(person));
    }

    // 2.通过暴力反射获取和设置私有方法
    @Test
    public void getFunction() throws Exception {
        Class<Person> personClass = Person.class;
        Method declaredMethod = personClass.getDeclaredMethod("save", String.class, int.class);
        System.out.println(declaredMethod.getName());

        Person person = personClass.newInstance();
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(person, "蟹黄包", 100);
    }
}
