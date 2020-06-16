package com.keminapera.junit5;

import com.keminapera.junit4.JunitAnnotation;
import org.junit.jupiter.api.*;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/14 下午4:14
 */
public class JunitAnnotationTest {
    @org.junit.jupiter.api.Test
    public void say() {
        JunitAnnotation junitAnnotation = new JunitAnnotation();
        junitAnnotation.say();
    }

    @org.junit.jupiter.api.Test
    public void hello() {
        JunitAnnotation junitAnnotation = new JunitAnnotation();
        junitAnnotation.hello();
    }

    @org.junit.jupiter.api.Test
    @Disabled("print 方法被忽略了")
    public void print() {
        JunitAnnotation junitAnnotation = new JunitAnnotation();
        junitAnnotation.print();
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("This is beforeClass method...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("This is afterClass method...");
    }

    @BeforeEach
    public void before() {
        System.out.println("-----------------------------");
        System.out.println("This is before method...");
    }

    @AfterEach
    public void after() {
        System.out.println("This is after method...");
    }
}
