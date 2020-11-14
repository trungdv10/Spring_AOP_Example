package com.journaldev.spring.configuration;

import com.journaldev.spring.aspect.*;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setName("Dummy Name");
        return employee;
    }

    @Bean
    public EmployeeService employeeService( Employee e) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.setEmployee(e);
        return employeeService;
    }

    @Bean
    public EmployeeAspect employeeAspect() {
        return new EmployeeAspect();
    }

    @Bean
    public EmployeeAspectJoinPoint employeeAspectJoinPoint() {
        return new EmployeeAspectJoinPoint();
    }

    @Bean
    public EmployeeAspectPointcut employeeAspectPointcut() {
        return new EmployeeAspectPointcut();
    }

    @Bean
    public EmployeeAnnotationAspect employeeAnnotationAspect() {
        return new EmployeeAnnotationAspect();
    }

    @Bean
    public EmployeeAroundAspect employeeAroundAspect() {
        return new EmployeeAroundAspect();
    }

    @Bean
    public EmployeeAfterAspect employeeAfterAspect() {
        return new EmployeeAfterAspect();
    }
}
