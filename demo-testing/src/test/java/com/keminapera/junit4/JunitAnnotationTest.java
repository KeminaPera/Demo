package com.keminapera.junit4;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitAnnotationTest {

    @Test
    public void say() {
        JunitAnnotation junitAnnotation = new JunitAnnotation();
        junitAnnotation.say();
    }

    @Test
    public void hello() {
        JunitAnnotation junitAnnotation = new JunitAnnotation();
        junitAnnotation.hello();
    }

    @Test
    @Ignore("print 方法被忽略了")
    public void print() {
        JunitAnnotation junitAnnotation = new JunitAnnotation();
        junitAnnotation.print();
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is beforeClass method...");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This is afterClass method...");
    }

    @Before
    public void before() {
        System.out.println("-----------------------------");
        System.out.println("This is before method...");
    }

    @After
    public void after() {
        System.out.println("This is after method...");
    }
}