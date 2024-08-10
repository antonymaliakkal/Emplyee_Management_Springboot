package org.example.service;

import org.example.domain.Employee;
import org.example.dto.EmployeeDto;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createRegular(EmployeeDto employeeDto) {
        Employee employee = new Employee();

        employee.setEmail(employeeDto.email());
        employee.setFullName(employee.getFullName());

        return employeeRepository.save(employee);


    }
}
