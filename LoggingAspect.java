package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.service.EmployeeService.addEmployee(..))")
    private void addEmployee() {
    }

    @Pointcut("execution(* com.example.service.EmployeeService.displayEmployee(..))")
    private void displayEmployee() {
    }

    @Pointcut("execution(* com.example.service.EmployeeService.calculateSalary(..))")
    private void calculateSalary() {
    }

    @Before("addEmployee()")
    public void logBeforeAdd() {
        System.out.println("Logging: Adding employee");
    }

    @Before("displayEmployee()")
    public void logBeforeDisplay() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("calculateSalary()")
    public void logBeforeSalary() {
        System.out.println("Logging: Calculating salary");
    }
}