package com.keminapera.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Static.class)
public class StaticTest {

    @Test
    public void testSum() {
        PowerMockito.mockStatic(Static.class);
        Mockito.when(Static.sum(anyInt(), anyInt())).thenReturn(3);
        int sum = Static.sum(6, 7);
        System.out.println(sum);
    }

}