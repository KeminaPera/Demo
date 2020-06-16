package com.keminapera.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest
public class MyUtilTest {

    @Test
    public void convertToUpper() {
        PowerMockito.mockStatic(MyUtil.class);
    }

    @Test
    public void consumer() {

    }
}