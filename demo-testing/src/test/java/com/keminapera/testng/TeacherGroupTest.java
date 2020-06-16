package com.keminapera.testng;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/16 下午9:31
 */
public class TeacherGroupTest {
    @BeforeGroups(groups = {"first"})
    public void beforeGroup() {
        System.out.println("beforeGroup...");
    }

    @AfterGroups(groups = {"first"})
    public void afterGroup() {
        System.out.println("afterGroup...");
    }

    @Test(groups = {"first"})
    public void test() {
        System.out.println("test01....");
    }
}
