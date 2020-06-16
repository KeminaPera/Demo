package com.keminapera.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.powermock.api.mockito.PowerMockito.doNothing;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FianlEmployeeDao.class)
public class EmployeeServiceTest {

    @Test
    public void getEmployeeCount() {
        EmployeeDao mock = PowerMockito.mock(EmployeeDao.class);
        EmployeeService service = new EmployeeService(mock);
        when(service.getEmployeeCount()).thenReturn(888);

        int actaul = service.getEmployeeCount();

        assertThat(actaul, is(equalTo(888)));
    }

    @Test
    public void getEmployeeCount1() {
        EmployeeDao mock = PowerMockito.mock(EmployeeDao.class);
        EmployeeService service = new EmployeeService(mock);
        when(mock.getCount()).thenReturn(888);

        int actaul = service.getEmployeeCount();

        assertThat(actaul, is(equalTo(888)));
    }

    @Test
    public void testGetEmployeeCount() {
        Employee employee = new Employee();
        EmployeeDao mock = Mockito.mock(EmployeeDao.class);
        EmployeeService service = new EmployeeService(mock);
        Mockito.doNothing().when(mock).addEmployee(new Employee());

        service.add(employee);

        Mockito.verify(mock).addEmployee(employee);
    }

    @Test
    public void testGetEmployeeCountByPowerMock() {
        Employee employee = new Employee();
        EmployeeDao mock = PowerMockito.mock(EmployeeDao.class);
        EmployeeService service = new EmployeeService(mock);
        PowerMockito.doNothing().when(mock).addEmployee(new Employee());

        service.add(employee);

    }

    @Test
    public void testPrivate() {
        Employee employee = new Employee();
        EmployeeDao employeeDao = PowerMockito.mock(EmployeeDao.class);
        EmployeeService employeeService = new EmployeeService(employeeDao);

        PowerMockito.doNothing().when(employeeDao).update(employee);

        employeeService.update(employee);

    }

    @Test
    public void testGetEmployeeCount1() {
    }

    @Test
    public void finalUpdate() {
        FianlEmployeeDao dao = Mockito.mock(FianlEmployeeDao.class);
        EmployeeService service = new EmployeeService(dao);
        //Employee employee = new Employee();
        doNothing().when(dao).update(new Employee());

        service.finalUpdate(new Employee());

        Mockito.verify(dao).update(new Employee());
    }

    @Test
    public void testFialUpdate() {
        FianlEmployeeDao employeeDao = PowerMockito.mock(FianlEmployeeDao.class);
        EmployeeService service = new EmployeeService(employeeDao);
        Employee employee = new Employee();

        PowerMockito.doNothing().when(employeeDao).update(employee);

        service.finalUpdate(employee);

        Mockito.verify(employeeDao).update(employee);
    }
}