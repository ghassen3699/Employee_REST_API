package com.example.employeerest_api.dao;

import com.example.employeerest_api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {


    List<Employee> findAll() ;
}
