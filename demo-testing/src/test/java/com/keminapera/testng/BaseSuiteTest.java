package com.keminapera.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/16 下午9:28
 */
public class BaseSuiteTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite...");
    }
}
