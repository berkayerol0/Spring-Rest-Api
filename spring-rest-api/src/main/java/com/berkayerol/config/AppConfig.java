package com.berkayerol.config;

import com.berkayerol.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Berkay","Erol"));
        employeeList.add(new Employee("2","Zeyd","Alcan"));
        employeeList.add(new Employee("3","Çağdaş","Çakır"));
        employeeList.add(new Employee("4","Fatih","Zengin"));
        employeeList.add(new Employee("5","Alperen","Kayan"));

        return employeeList;
    }
}
