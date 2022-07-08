package com.example.employeerest_api.rest;

import com.example.employeerest_api.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Employee {
    private EmployeeDAO employeeDAO ;

    @Autowired
    public void EmployeeRestController (EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<com.example.employeerest_api.entity.Employee> findAll(){
        return employeeDAO.findAll();
    }
}
