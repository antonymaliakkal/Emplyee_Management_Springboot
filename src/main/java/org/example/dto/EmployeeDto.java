package org.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import org.example.domain.Employee;

public record EmployeeDto (

//    int empId,

    @NotEmpty(message = "Name is required")
    String fullName,

    @NotEmpty(message = "Email is required")
    @Email(message = "Email is required")
    String email

){}


