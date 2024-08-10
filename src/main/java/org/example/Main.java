package org.example;

import org.example.domain.RegularEmployee;
import org.example.domain.TempEmployee;
import org.example.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
//            return args -> {
//                TempEmployee tempEmployee = new TempEmployee();
//                tempEmployee.setFullName("Person 1");
//                tempEmployee.setEmail("john.doe");
//                tempEmployee.setDailyWages(1000);
//                tempEmployee.setDays(6);
//                employeeRepository.save(tempEmployee);
//                System.out.println("Employee saved: " + tempEmployee);
//                RegularEmployee regularEmployee = new RegularEmployee();
//                regularEmployee.setFullName("Person 2");
//                regularEmployee.setEmail("jane.doe");
//                regularEmployee.setSalary(5000);
//                regularEmployee.setBonus(500);
//                employeeRepository.save(regularEmployee);
//
//                employeeRepository.findAll().forEach(System.out::println);
//            };
//    }
}