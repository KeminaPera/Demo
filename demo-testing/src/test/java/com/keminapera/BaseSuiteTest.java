package com.keminapera;

import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/3 下午10:17
 */
public class BaseSuiteTest {
    @BeforeMethod
    public void setup() {
        System.out.println("shis is super class...");
        MockitoAnnotations.initMocks(this);
    }
}
