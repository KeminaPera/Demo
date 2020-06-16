package com.keminapera.powermock;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(PowerMockRunner.class)
@PrepareForTest(EmployeeLocalService.class)
public class EmployeeLocalServiceTest {

    @Test
    public void getTotleCount() throws Exception {
        //准备数据
        EmployeeLocalService employeeLocalService = new EmployeeLocalService();
        EmployeeDao employeeDao = PowerMockito.mock(EmployeeDao.class);
        //打桩
        PowerMockito.whenNew(EmployeeDao.class).withNoArguments().thenReturn(employeeDao);
        PowerMockito.when(employeeDao.getCount()).thenReturn(10);
        //执行
        int totleCount = employeeLocalService.getTotleCount();
        //断言
        assertThat(totleCount, Matchers.is(10));
    }

    @Test
    public void testAdd() throws Exception {
        //准备数据
        EmployeeLocalService employeeLocalService = new EmployeeLocalService();
        EmployeeDao employeeDao = PowerMockito.mock(EmployeeDao.class);
        Employee employee = new Employee();
        //模拟
        PowerMockito.whenNew(EmployeeDao.class).withNoArguments().thenReturn(employeeDao);
        //执行
        employeeLocalService.addEmployee(employee);
        //验证
        Mockito.verify(employeeDao).addEmployee(employee);
    }

    @Test
    public void updateOrAdd() throws Exception {
        //准备数据
        EmployeeDao mockEmployeeDao = PowerMockito.mock(EmployeeDao.class);
        EmployeeLocalService service = new EmployeeLocalService();
        Employee employee = new Employee();
        //打桩
        PowerMockito.whenNew(EmployeeDao.class).withNoArguments().thenReturn(mockEmployeeDao);
        //对于mock对象，如果不指定返回值，则返回对应类型的零值
        //PowerMockito.when(mockEmployeeDao.selectById(anyString())).thenReturn(null);
        //执行
        service.updateOrAdd(employee);
        //校验
        Mockito.verify(mockEmployeeDao).addEmployee(employee);
        Mockito.verify(mockEmployeeDao,Mockito.never()).updateEmployee(employee);
    }

    @Test
    public void updateOrAdd2() throws Exception {
        //准备数据
        Employee tempEmployee = new Employee("123", "kemima", 23, "北京");
        EmployeeLocalService service = new EmployeeLocalService();
        EmployeeDao mockedEmployeeDao = PowerMockito.mock(EmployeeDao.class);
        //打桩
        PowerMockito.whenNew(EmployeeDao.class).withNoArguments().thenReturn(mockedEmployeeDao);
        PowerMockito.when(mockedEmployeeDao.selectById("123")).thenReturn(new Employee());
        //PowerMockito.when(mockedEmployeeDao.selectById(anyString())).thenReturn(new Employee());
        //执行
        service.updateOrAdd(tempEmployee);
        //校验
        Mockito.verify(mockedEmployeeDao).updateEmployee(tempEmployee);
        Mockito.verify(mockedEmployeeDao, Mockito.never()).addEmployee(tempEmployee);
    }

}