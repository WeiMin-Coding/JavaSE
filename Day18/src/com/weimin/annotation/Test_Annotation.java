package com.weimin.annotation;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 本类用于测试自定义注解
 */
public class Test_Annotation {
    public static void main(String[] args) {

    }
}

// 1.定义自定义注解，注解名为Test
// 注解名定义的时候需要使用"@Interface 注解名"的方式来定义
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) // 表示此注解可以用来标记方法
@Retention(RetentionPolicy.SOURCE)
@interface Test {
    // 给注解添加功能/属性
    int age() default 0;
    // 特殊属性的定义方式与普通属性的定义方式相同，只是使用方式不同
    String value() default "WeiMin";
}

@Test
class TestAnno {
    // @Test(age = 1)
//    @Test("WeiMin123")
    @Test(value = "WeiMin123")
    String name;

    @Test
    public void eat() {
        System.out.println("又吃饭了！");
    }
}
