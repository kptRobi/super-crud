package com.example.supercrud.service;

import com.example.supercrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    //Create
    Employee createEmployee(Employee employee);

    //Read
    List<Employee> readEmployee();

    //Update
    Employee updateEmployee(Employee employee, Long id);

    //Delete
    String deleteEmployee(Long Id);
}
