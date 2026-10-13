package com.example;

import com.example.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            EmployeeService service = context.getBean(EmployeeService.class);

            service.addEmployee(101, "Sathya", 25000.0);
            System.out.println();

            service.displayEmployee();
            System.out.println();

            service.calculateSalary();
        }
    }
}