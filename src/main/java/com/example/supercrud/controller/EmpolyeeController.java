package com.example.supercrud.controller;


import com.example.supercrud.entity.Employee;
import com.example.supercrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
}
