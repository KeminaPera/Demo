package com.keminapera.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({EmployeeService01.class})
public class EmployeeService01Test {

    @Test
    public void lazyGet() throws Exception {
        EmployeeDaoWithTwoParam employeeDao = PowerMockito.mock(EmployeeDaoWithTwoParam.class);
        EmployeeService01 service = new EmployeeService01();

        PowerMockito.whenNew(EmployeeDaoWithTwoParam.class)
                .withArguments(false, EmployeeDaoWithTwoParam.Dialect.MYSQL)
                .thenReturn(employeeDao);

        service.lazyGet(false, EmployeeDaoWithTwoParam.Dialect.MYSQL);

        Mockito.verify(employeeDao).get();
    }
}