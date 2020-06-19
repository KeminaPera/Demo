package com.keminapera.powermock;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;
    @Mock
    private EmployeeDao employeeDao;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getEmployeeCount() {
        when(employeeService.getEmployeeCount()).thenReturn(10);
        EmployeeController employeeController = new EmployeeController(employeeService);
        int actual = employeeController.getEmployeeCount();
        assertThat(actual, Matchers.is(10));
    }

    @Test
    public void getEmployee() {
        when(employeeService.getEmployeeCount()).thenReturn(10);
        EmployeeController employeeController = new EmployeeController(employeeService);

        int employeeCount = employeeController.getEmployeeCount();
        assertThat(employeeCount, Matchers.is(10));
    }
}