package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/6 下午9:59
 */
public class EmployeeDao {

    public int getCount() {
        throw new UnsupportedOperationException("数据库现在不可用");
    }

    public void addEmployee(Employee employee) {
        throw new UnsupportedOperationException("数据库不可用");
    }
    public void updateEmployee(Employee employee) {
        throw new UnsupportedOperationException("数据库不可用");
    }
    private void check(Employee employee) {
        throw new UnsupportedOperationException("检查失败");
    }

    public void update(Employee employee) {
        check(employee);
    }



    public Employee selectById(String id) {
        throw new UnsupportedOperationException("数据库不可用");
    }
}
