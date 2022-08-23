package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public void SignUp(Employee employee) {

    }

    @Override
    public void savaBulkOfData(List<Employee> employees) {

    }

    @Override
    public boolean SignIn(String empEmailId, String empPassword) {
        return false;
    }

    @Override
    public Employee getDataById(int empId) {
        return null;
    }

    @Override
    public List<Employee> getAllData() {
        return null;
    }

    @Override
    public List<Employee> getDataByName(String empName) {
        return null;
    }

    @Override
    public Employee getDataByContactNumber(long empContactNumber) {
        return null;
    }

    @Override
    public Employee getDataByEmailId(String empEmailId) {
        return null;
    }

    @Override
    public List<Employee> filterDataBySalary(double empSalary) {
        return null;
    }

    @Override
    public List<Employee> sortByName() {
        return null;
    }
}
