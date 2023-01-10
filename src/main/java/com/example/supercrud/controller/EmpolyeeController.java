package com.example.supercrud.controller;


import com.example.supercrud.entity.Employee;
import com.example.supercrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmpolyeeController {
    @Autowired
    private EmployeeService employeeService;

    //Create
    @PostMapping("/create")
    public Employee createEmployee(@Valid @RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    //Read
    @GetMapping("/read")
    public List<Employee> getEmployee(){
        return employeeService.readEmployee();
    }

    //Update
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@Valid @RequestBody Employee employee, @PathVariable ("id") Long employeeId){
        return employeeService.updateEmployee(employee, employeeId);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable ("id") Long employeeId){
        return employeeService.deleteEmployee(employeeId);
    }
}
