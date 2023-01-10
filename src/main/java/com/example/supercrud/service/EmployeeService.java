package com.example.supercrud.service;

import com.example.supercrud.entity.Employee;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
@ComponentScan
public interface EmployeeService {
    //Create
    Employee createEmployee(Employee employee);

    //Read
    List<Employee> readEmployee();

    //Update
    void updateEmployee(Employee employee, Long id);

    //Delete
    void deleteEmployee(Long Id);
}
