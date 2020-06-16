package com.keminapera.powermock;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MyUtil.class)
public class StringPrinterTest {

    @Test
    public void print() {
        StringPrinter stringPrinter = new StringPrinter();
        String actual = stringPrinter.print("hello world");
        Assert.assertEquals(actual, "HELLO WORLD");
    }

    @Test
    public void testPrint() {
        //准备数据
        StringPrinter stringPrinter = new StringPrinter();
        PowerMockito.mockStatic(MyUtil.class);
        //打桩
        when(MyUtil.convertToUpper(anyString())).thenReturn("NI HAO YA");
        //执行
        String actual = stringPrinter.print("hello world");
        //断言
        assertThat(actual, Matchers.is("NI HAO YA"));
    }
}