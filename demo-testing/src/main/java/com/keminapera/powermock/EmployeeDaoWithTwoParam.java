package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/11 下午10:40
 */
public class EmployeeDaoWithTwoParam {
    public enum Dialect{
        ORACLE,
        MYSQL;
    }

    public EmployeeDaoWithTwoParam(boolean lazy, Dialect dialect) {
        throw new UnsupportedOperationException();
    }

    public Employee get() {
        throw new UnsupportedOperationException();
    }
}
