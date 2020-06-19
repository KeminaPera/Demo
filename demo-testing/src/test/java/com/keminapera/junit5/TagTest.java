package com.keminapera.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {
    @Test
    @Tag("90后")
    public void test00() {
        System.out.println("test00...");
    }

    @Test
    @Tag("高富帅")
    public void test01() {
        System.out.println("test01...");
    }

    @Test
    @Tag("90后")
    public void test02() {
        System.out.println("test02...");
    }
}
