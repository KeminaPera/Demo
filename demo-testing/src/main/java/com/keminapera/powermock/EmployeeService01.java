package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/11 下午10:44
 */
public class EmployeeService01 {
    public void lazyGet(boolean lazy, EmployeeDaoWithTwoParam.Dialect dialect) {
        EmployeeDaoWithTwoParam employeeDao = new EmployeeDaoWithTwoParam(lazy, dialect);
        employeeDao.get();
    }
}
