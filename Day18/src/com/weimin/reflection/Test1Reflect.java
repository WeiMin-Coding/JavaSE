package com.weimin.reflection;


import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 本类用于测试反射
 */
public class Test1Reflect {
    // 1.创建入口函数main()方法————不用

    /**
     * 单元测试方法：是java测试的最小单位，使用灵活，推荐程度5颗星
     * 语法要求：被@Test注解修饰 + 没有参数 + public + void没有返回值类型
     */
    // 2.通过单元测试方法获取类的字节码对象（类对象）
    @Test
    public void getClazz() throws ClassNotFoundException {
        Class<?> student1 = Class.forName("com.weimin.reflection.Student");
        Class<?> student2 = Student.class;
        Class<? extends Student> student3 = new Student().getClass();

        System.out.println(student1);
        System.out.println(student2.getName());
        System.out.println(student3.getSimpleName());
        System.out.println(student3.getPackage().getName());
    }

    // 3.通过单元测试来获取构造方法
    @Test
    public void getConstructor() {
        Class<?> clazz = Student.class;
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println(constructors.length);

        for (Constructor cs : constructors) {
            System.out.println(cs.getName());
            Class[] parameterTypes = cs.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes));
        }
    }

    // 4.通过单元测试获取普通方法
    @Test
    public void getFunction() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.weimin.reflection.Student");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.print(method.getName() + " ");
            System.out.println(Arrays.toString(parameterTypes));
        }
    }

    // 5.通过单元测试获取成员变量
    @Test
    public void getFields() {
        Class<? extends Student> aClass = new Student().getClass();
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
        }
    }

    // 6.通过单元测试反射创建对象
    @Test
    public void createObject() throws Exception {
        Class<?> clazz = Student.class;

        Object obj = clazz.newInstance();   // 默认触发无参构造
        Student weimin1 = (Student) obj;
        System.out.println(weimin1);

        // 获取构造方法
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Object weimin2 = constructor.newInstance("WeiMin", 66666);
        System.out.println(weimin2);

        // Object没有子类的方法，所以强制类型转换将weimin2转换成Student
        Student weimin3 = (Student) weimin2;
        weimin3.tell();
     }
}
