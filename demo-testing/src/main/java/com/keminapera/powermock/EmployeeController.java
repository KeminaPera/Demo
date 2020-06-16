package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/10 下午9:03
 */
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public int getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }
}
