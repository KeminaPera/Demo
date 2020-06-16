package com.keminapera.mockito;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class StrAppendTest {

    @Mock
    private StrApendHelper helper;
    @Mock
    private StrAppend strAppend;

    @BeforeClass
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppend() {
        when(strAppend.append(anyString())).thenReturn("hello world");
        String originStr = helper.getOriginStr();
        //strAppend.append("123");

        verify(strAppend, never()).append(anyString());
        //assertEquals(originStr, "hello world");
    }
}