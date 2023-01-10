package com.example.supercrud.service;

import com.example.supercrud.entity.Employee;
import com.example.supercrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Create
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //Read
    @Override
    public List<Employee> readEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long Id) {
        if(employeeRepository.existsById(Id)){
            employee.setEmployeeId(Id);
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public String deleteEmployee(Long Id) {
        if(employeeRepository.existsById(Id)){
            employeeRepository.deleteById(Id);
            return "Employee deleted";}
        return "No matching ID";
    }
}
