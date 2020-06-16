package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/6 下午9:58
 */
public class EmployeeService {
    private FianlEmployeeDao dao;

    private EmployeeDao employeeDao;

    public EmployeeService(FianlEmployeeDao dao, EmployeeDao employeeDao) {
        this.dao = dao;
        this.employeeDao = employeeDao;
    }

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public EmployeeService(FianlEmployeeDao dao) {
        this.dao = dao;
    }

    public int getEmployeeCount() {
        return employeeDao.getCount();
    }

    public void add(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    public void finalUpdate(Employee employee) {
        dao.update(employee);
    }

}
