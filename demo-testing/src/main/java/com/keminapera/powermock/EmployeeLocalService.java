package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/10 上午12:39
 */
public class EmployeeLocalService {
    public int getTotleCount() {
        EmployeeDao employeeDao = new EmployeeDao();
        return employeeDao.getCount();
    }

    public void addEmployee(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.addEmployee(employee);
    }

    public void updateOrAdd(Employee employee) {
        final EmployeeDao employeeDao = new EmployeeDao();
        Employee employeeInDb = employeeDao.selectById(employee.getId());
        if (employeeInDb != null) {
            employeeDao.updateEmployee(employee);
        }else {
            employeeDao.addEmployee(employee);
        }
    }
}
