package com.keminapera.mockito.mock00;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.anyString;

public class MainTest {
    //依赖类
    private Guest guest;
    //被测试类
    private Main main;

    @Before
    public void setUp() {
        guest = Mockito.mock(Guest.class);
        main = new Main(guest);
    }
    @Test
    public void printer() {
        Mockito.doNothing().when(guest).print(anyString());
        main.printer("java");
        Mockito.verify(guest).print("java");
    }

    @Test
    public void convertUpper0() {
        Mockito.when(guest.toUpper(anyString())).thenReturn("HELLO WORLD");
        String actual = main.convertUpper("ni hao ya");
        assertThat(actual, equalTo("HELLO WORLD"));
    }

    @Test
    public void convertUpper1() {
        Mockito.doReturn("HELLO WORLD").when(guest).toUpper(anyString());
        String actual = main.convertUpper("ni hao ya");
        assertThat(actual, equalTo("HELLO WORLD"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getContentFromDb0() {
        Mockito.when(guest.getContentFromDb()).thenThrow(new UnsupportedOperationException("不可用"));
        main.getContentFromDb();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getContentFromDb1() {
        Mockito.doThrow(UnsupportedOperationException.class).when(guest).getContentFromDb();
        main.getContentFromDb();
    }
}