package com.keminapera;

import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/4 下午10:26
 */
public class BastTest {
    @BeforeMethod
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
}
