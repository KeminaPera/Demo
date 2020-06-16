package com.keminapera.mockito;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/6 上午11:23
 */
public class Mockito00 {
    @Mock
    private List<String> list;

    @BeforeMethod
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test00() {
        when(list.get(anyInt())).thenReturn("kemina", "pera", "alex");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }

    @Test
    public void test01() {
    }
}
