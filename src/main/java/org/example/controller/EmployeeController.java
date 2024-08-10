package org.example.controller;

import org.example.domain.Employee;
import org.example.dto.EmployeeDto;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/regular")
    public ResponseEntity<Employee> createEmployee(EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.createRegular(employeeDto));
    }

}
